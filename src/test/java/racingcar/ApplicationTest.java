package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.model.ErrorType;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.*;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 기능_테스트() {
        assertRandomNumberInRangeTest(
            () -> {
                run("pobi,woni", "1");
                assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
            },
            MOVING_FORWARD, STOP
        );
    }

    @Test
    void 예외_테스트() {
        assertSimpleTest(() ->
            assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                .isInstanceOf(IllegalArgumentException.class)
        );
    }

    @Test
    @DisplayName("공백, 개행문자, tab 와같은 빈 문자열 입력시 예외 처리")
    void checkedEmptyStringInput() {
        assertThatThrownBy(() -> runException(" ","","     "))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorType.INPUT_NULL_ERROR.getMessage());
    }

    @Test
    @DisplayName("게임 실행 횟수 1회 미만시 예외 처리")
    void checkedTryGameNum() {
        assertThatThrownBy(() -> runException("0", "-10", "-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorType.GAME_TRY_COUNT_ERROR.getMessage());
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
