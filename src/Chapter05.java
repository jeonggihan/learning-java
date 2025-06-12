public class Chapter05 {
    public static void main(String[] args) {
        // 1. 클래스 정의와 객체 생성
        System.out.println("1. 클래스 정의와 객체 생성");
        Person p1 = new Person();
        p1.name = "김태이";
        p1.age = 30;
        p1.introduce();

        // 2. 생성자
        System.out.println("\n2. 생성자 사용");
        Person p2 = new Person("이송희", 25);
        p2.introduce();

        // 3. 메서드와 오버로딩
        System.out.println("\n3. 메서드와 오버로딩");
        Calculator calc = new Calculator();
        System.out.println("덧셈 (int): " + calc.add(3, 4));
        System.out.println("덧셈 (double): " + calc.add(3.0, 4.5));

        // 4. this 키워드
        System.out.println("\n4. this 키워드 확인");
        Person p3 = new Person("한정기");
        p3.age = 22;
        p3.introduce();

        // 5. 접근 제어자 확인
        System.out.println("\n5. 접근 제어자 확인");
        AccessExample example = new AccessExample();
        example.publicField = "공개";
        // example.privateField = "비공개"; // 컴파일 에러 (접근 불가)
        // example.protectedField = "보호됨"; // 다른 패키지/비상속 관계면 접근 불가
        example.printFields();

        // 6. static 변수와 메서드
        System.out.println("\n6. static 변수와 메서드");
        System.out.println("현재 인원 수: " + Person.count);
        Person.printCount();
    }
}

// Person 클래스 정의
class Person {
    String name;
    int age;
    static int count = 0;

    // 기본 생성자
    public Person() {
        count++;
    }

    // 생성자 오버로딩
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        count++;
    }

    // this 키워드 예제용 생성자
    public Person(String name) {
        this.name = name;
        count++;
    }

    void introduce() {
        System.out.println("안녕하세요, 제 이름은 " + name + "이고 나이는 " + age + "입니다.");
    }

    public static void printCount() {
        System.out.println("총 인원 수: " + count);
    }
}

// 메서드와 오버로딩 예제
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// 접근 제어자 예제 클래스
class AccessExample {
    public String publicField = "기본값";
    private String privateField = "비공개";
    protected String protectedField = "보호됨";

    public void printFields() {
        System.out.println("public: " + publicField);
        System.out.println("private: " + privateField);
        System.out.println("protected: " + protectedField);
    }
}
