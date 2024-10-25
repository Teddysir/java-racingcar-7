package racingcar.model;


import camp.nextstep.edu.missionutils.Randoms;

public class Car {

    private String name;
    private int moveCount = 0;

    public Car(String name) {
        this.name = name;
    }

    public void moveCar() {
        int randomNum = Randoms.pickNumberInRange(0, 9);
        if (randomNum >= 4) {
            moveCount++;
        }
    }

    public boolean isSameMoveCount(int moveCount) {
        return this.getMoveCount() == moveCount;
    }

    public String getName() {
        return name;
    }

    public int getMoveCount() {
        return moveCount;
    }
}
