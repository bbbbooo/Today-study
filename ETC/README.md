# 프로그램, 스레드와 프로세스

### 프로그램
> - 저장 장치에 저장되어있지만, 실제로는 아무런 동작도 하지 않은 정적인 상태의 코드 덩어리 </br>
> - 우리가 아직 실행하지 않은 `~.exe` 같은 형태로 되어있는 파일들을 말한다


### 프로세스
> - 앞서 말한 프로그램을 실행한 것이 프로세스
> - 프로그램을 실행하면 파일을 컴퓨터의 메모리에 올라가게 된다. 이 메모리에 올라가있는 상태를 `동적인` 상태라고 하는데 바로 이 상태의 프로그램을 프로세스라고 칭한다.


### 스레드
> - 프로세스안에 포함된 개념으로, 스레드는 프로세스의 자원을 공유하면서 실행되는 작업 단위
> - 코드로 비유하자면 스레드는 코드 내 선언된 함수들이 될 것이고 main 함수 또한 일종의 스레드가 될 수 있다