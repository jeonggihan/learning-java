public class Chapter06 {
    public static void main(String[] args) {

        // 1. 상속
        System.out.println("1. 상속");
        Dog dog = new Dog();
        dog.sound(); // 부모 메서드 + 자식 재정의
        dog.bark();  // 자식 메서드

        // 2. super 키워드
        System.out.println("\n2. super 키워드");
        dog.callSuperSound(); // 부모 sound() 명시적 호출

        // 3. 메서드 오버라이딩
        System.out.println("\n3. 메서드 오버라이딩");
        Animal overridden = new Dog();
        overridden.sound(); // 자식의 sound() 실행

        // 4. 업캐스팅과 다운캐스팅
        System.out.println("\n4. 업캐스팅과 다운캐스팅");
        Animal animal = new Dog(); // 업캐스팅 (자동)
        animal.sound();

        if (animal instanceof Dog) {
            Dog downcastedDog = (Dog) animal; // 다운캐스팅 (명시적)
            downcastedDog.bark();
        }

        // 5. 다형성
        System.out.println("\n5. 다형성");
        Animal[] animals = {new Dog(), new Cat()};
        for (Animal a : animals) {
            a.sound(); // 각 타입에 따라 다른 동작 수행
        }
    }
}

// 부모 클래스
class Animal {
    void sound() {
        System.out.println("소리를 냅니다");
    }
}

// 자식 클래스 Dog
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("멍멍!");
    }

    void bark() {
        System.out.println("Dog만의 행동: 멍멍");
    }

    void callSuperSound() {
        super.sound(); // 부모 메서드 호출
    }
}

// 자식 클래스 Cat
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("야옹!");
    }
}
