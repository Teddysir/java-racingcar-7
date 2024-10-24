# 미션 - 자동차 경주 🚘

- ### 미완성 ☑️
- ### 완성 ✅
---
## 💡 입력 조건
- **콤마(,) 로 자동차의 이름을 구분한다.**
- **콤마로 구분된 이름은 5자 이하여야 한다.**
- ✅ 자동차 이름을 입력받는 메서드 구현
  - 출력 : `경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)`
  - 입력 : `pobi,jun,java`
- ✅ 몇 번의 이동을 할 것인지 입력받는 메서드 구현
  - 출력 : `시도할 횟수는 몇 회인가요?` 
  - 입력 : `4`

---
## 📚 기능 명세
- ### 자동차는 0~9 사이 랜덤 숫자에서 값이 4 이상 나올경우 전진 한다.
- ✅ 콤마(,)로 분리한 각 이름을 공백을 제거후 저장하는 메서드 구현
  - 콤마(,)로 구분된 이름을 객체로 저장한다.
  - 객체로 저장하기 전 예외처리를 모두 통과한다.
- ☑️ 입력 받은 횟수 만큼 게임을 진행하는 메서드 구현
  - 3을 입력받은 경우 주사위를 굴리는 게임을 3회 호출한다.
- ☑️ 4 이상이 나온 사용자에게 "-"를 추가해 주는 메서드 구현
  - 0~9 사이의 랜덤한 숫자를 뽑는다.
  - 4 이상일 경우 "-"를 추가 해준다.
  - 3 이하일 경우 아무 작동을 하지 않는다.

---
## 💡 출력 조건
- ☑️ 차수별 실행 결과를 출력한다.
  - 한 칸 전진된 표시는 "-" 로 표시한다.
  - 출력</br> `실행결과` </br>
  `pobi : -- `</br>`jun : -`
- ☑️ 우승자의 이름을 출력한다. (우승자는 한 명 이상일 수 있으며, 콤마(,)로 구분한다.)
  - 단독 우승자 안내 문구
    - `최종 우승자 : pobi`
  - 공동 우승자 안내 문구
    - `공동 우승자 : pobi, jun`

---
## ⚠️ Exceptions
- ✅ 사용자에게 빈 문자열이 입력될 경우 예외 처리
  - 입력 : `""`
  - 출력 : `[ERROR] 빈 문자열은 입력할 수 없습니다.`
- ✅ 콤마(,)로 구분된 이름 중 하나라도 null 값일 경우 예외처리
  - 입력 : `pobi,,jun`
  - 출력 : `[ERROR] 빈 문자열은 입력할 수 없습니다.`
- ✅ 공백을 제거한 구분된 이름이 5자 초과일 경우 예외 처리
  - 입력 : `pobi,javaji`
  - 출력 : `[ERROR] 이름은 5자 이하여야 합니다.`
- ✅ 시도 횟수가 1회 미만일 경우 예외 처리
  - 입력 : `pobi,java`, `0`
  - 출력 : `[ERROR] 입력 횟수는 1회 이상이여야 합니다.`
- ✅ 중복된 이름 예외 처리
  - 입력 : `pobi,java,pobi`
  - 출력 : `[ERROR] 중복된 이름이 있습니다.`

---
    
### 📢 주의 사항
- depth가 3이 넘지 않도록 주의할 것
- 에러 코드는 [ERROR]로 시작할 것
- 함수가 한 가지 일만 하도록 분리할 것
- 3항 연산자를 사용하지 않을 것

---
### 👀 피드백 적용 사항
- ☑️ 커밋메시지 본문 작성을 하였는가? 
- ☑️ 상수화를 사용할 수 있는 경우 고려했는가?
- ☑️ 클래스, 메서드, 변수 작명을 고려했는가?
- ☑️ TDD 코드에 어노테이션 적용 및 발전된 모습을 보였는가?
- ☑️ 서비스 클래스를 분리하였는가?
- ☑️ 에러메시지는 Enum 타입으로 사용을 고려해 보았는가?
- ☑️ IDE 코드 정렬 기능을 주기적으로 사용하였는가?
- ☑️ PR전 커밋 내용이 모두 올라갔는지 확인하였는가?

