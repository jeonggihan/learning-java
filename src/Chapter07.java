// Chapter07 - 추상 클래스와 인터페이스

public class Chapter07 {
    public static void main(String[] args) {

        abstract class Animal {
            String name;

            Animal(String name) {
                this.name = name;
            }

            abstract void makeSound();
        }

        class Dog extends Animal {
            Dog(String name) {
                super(name);
            }

            @Override
            void makeSound() {
                System.out.println(name + "이(가) 멍멍 짖습니다.");
            }
        }

        interface Vehicle {
            void move();
        }

        class Car implements Vehicle {
            @Override
            public void move() {
                System.out.println("자동차가 도로를 달립니다.");
            }
        }

        Animal dog = new Dog("초코");
        dog.makeSound();

        Vehicle car = new Car();
        car.move();
    }
}