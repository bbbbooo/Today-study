# 제네릭

---

> 특정 데이터 타입으로 데이터를 일반화 시킨다는 의미이다.

### 사용법

> 인스턴스 생성 시, <> 안에 원하는 데이터 타입을 넣어줌으로써 해당 인스턴스를 <> 안에 넣은 데이터 타입으로 지정해준다.



```java
public class Main{
    public static void main(String[] args) {
        Generic<Integer> g1 = new Generic<>();
    }
}
```

<br>

### 그래서 왜 쓰는데?

- 데이터 타입을 하나로 지정해주어 안정성을 높여준다.
- 데이터를 다양한 타입으로 변환할 수 있기 때문에 불필요한 코드 작성을 줄일 수 있다.


<br>

```java
public class Member<T> {
    private String name;
    private String email;
    private T pw;

    // 생성자, 게터, 세터, 기타 메소드들...
}

public class Main {
    public static void main(String[] args) {
        Member<Integer> member1 = new Member<>();
        member1.setName("John");
        member1.setPw(123456);

        Member<String> member2 = new Member<>();
        member2.setName("Alice");
        member2.setEmail("alice@example.com");
        member2.setPw("password123");
    }
}

```

- 해당 코드 내에서 pw를 Integer와 String 두가지 타입으로 변환하여 사용할 수 있다.
- 개발자 본인이 원하는 상황에 맞추어 사용할 수 있기 때문에 코드 작성이 비교적 간결해진다.

---

<br>

# 동적 바인딩


## 바인딩
> 값들이 이미 할당되어 변경할 수 없는 상태가 되는 것

<br>

## 정적 바인딩
> - 컴파일 시점에 이미 확정된 바인딩 <br>
> - static, private, final 키워드를 가진 변수나 메소드는 컴파일 시점에 이미 확정된다. <br>
> - static은 실행과 동시에 메모리에 올라가고 private는 다른 곳에서 참조될 수 없고 final은 값이 변하지 않기 때문에 컴파일 시점에서 값이 확정된다.

<br>

## 동적 바인딩
> - 런타임 시점에 확정된 바인딩   
> - overriding을 예로 들 수 있다.

- Java는 객체 데이터 저장을 위한 메모리 외에 테이블 주소를 저장하기 위한 메모리 4byte를 추가로 할당받는다.이때, 가상 테이블은 클래스에 대한 정보(자신의 클래스, 부모의 클래스)를 저장한 테이블이다.   
- overrding을 통해 메소드를 재정의 했을때, 가상 테이블에서는 **부모 클래스의 메소드 주소를 오버라이딩한 메소드 주소로 매핑**된다.
- 부모 타입에 자식객체를 초기화하고 메소드를 호출하면 오버라이딩된 메소드가 호출되는 이유가 바로 이것이다.



