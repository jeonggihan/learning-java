// Chapter13 - static과 final
class MathUtil {
    public static final double PI = 3.14159;

    public static int square(int x) {
        return x * x;
    }
}

public class Chapter13 {
    public static void main(String[] args) {
        int value = 5;
        System.out.println("정사각형 넓이: " + MathUtil.square(value));
        System.out.println("PI 값: " + MathUtil.PI);
    }
}
