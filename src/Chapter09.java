// Chapter09 - 예외 처리
public class Chapter09 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
