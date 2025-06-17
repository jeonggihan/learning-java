// Chapter09 - 예외 처리
public class Chapter09 {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("결과: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("예외 발생: " + e.getMessage());
        } finally {
            System.out.println("항상실행");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
