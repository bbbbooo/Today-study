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





