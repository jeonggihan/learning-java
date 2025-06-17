import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

// Chapter14 - 내부 클래스와 람다
public class Chapter14 {
    public static void main(String[] args) {
        // 내부 클래스
        class Inner {
            void greet() {
                System.out.println("Hello from Inner Class");
            }
        }

        Inner inner = new Inner();
        inner.greet();

        // 람다식
        Runnable task = () -> System.out.println("Hello from Lambda");
        task.run();
    }


}
