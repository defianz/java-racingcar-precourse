# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)


## 기능 구현 목록
### 모델링
#### GameController
- 게임 과정이 순서대로 실행된다.

#### Message
- 에러 메시지 필드 추가

#### CarName
- 5자 이하의 입력이 아닐 경우, IllegalArgumentException 및 메시지 출력

#### Postition
- int 값의 position 필드를 가진다.
- 다른 Postition과 비교 가능하다.
- position 값을 증가시킬 수 있다.


#### CarStatus
- Enum 으로, MOVE , STOP 값 가짐

#### CarMoveCondition
- 자동차가 움직이게 되는 로직
- CarStatus로 리턴함

#### Car
- CarName을 가진다. (이름)
- Position을 가진다. (위치)
- CarName을 Position을 반환할 수 있다.
- 입력된 값이 4 이상일 경우, Position에 값을 추가하고, 3이하인 경우 추가하지 않는다.

#### Cars
- 자동차들의 이름과 위치 값으로 현재 상황을 출력할 수 있다.
- 자동차들의 우승 이동 횟수를 구할 수 있다.
- 게임이 완료 된 후 누가 우승했는지 출력한다.

### InputUtils
- 자동차의 이름을 입력할 수 있다.
- 시도 할 횟수를 입력할 수 있다.


### OutputUtils
- 사용자에게 입력메시지 관련한 내용을 출력할 수 있다.
- 실행결과를 출력할 수 있다. (자동차 이름, 위치)
- 최종 우승자를 출력할 수 있다.


## 구현 기능 목록
- [X] Car 구현
      - CarName 구현
      - Position 구현
      - CarStatus 구현
      - CarMoveCondition 구현
- [ ] Cars 구현
- [ ] InputUtils 구현
- [ ] OutputUtils 구현
- [ ] GameController 구현