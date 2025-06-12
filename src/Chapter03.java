public class Chapter03 {
    public static void main(String[] args) {

        // 1. 산술 연산자
        int a = 10, b = 3;
        System.out.println("산술 연산자");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b)); // 정수 나눗셈
        System.out.println("a % b = " + (a % b));
        System.out.println();

        // 2. 비교 연산자
        System.out.println("비교 연산자");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // 3. 논리 연산자
        boolean x = true, y = false;
        System.out.println("논리 연산자");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!x = " + (!x));
        System.out.println();

        // 4. 대입 연산자
        int c = 5;
        System.out.println("대입 연산자");
        c += 3;  // c = c + 3
        System.out.println("c += 3: " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2: " + c);
        c -= 4;  // c = c - 4
        System.out.println("c -= 4: " + c);
        System.out.println();

        // 5. 증감 연산자
        int d = 5;
        System.out.println("증감 연산자");
        System.out.println("++d = " + (++d)); // 전위 증가
        System.out.println("d++ = " + (d++)); // 후위 증가
        System.out.println("d = " + d);       // 최종 값
        System.out.println("--d = " + (--d)); // 전위 감소
        System.out.println("d-- = " + (d--)); // 후위 감소
        System.out.println("d = " + d);       // 최종 값
        System.out.println();

        // 6. 삼항 연산자
        int score = 72;
        String result = (score >= 60) ? "합격" : "불합격";
        System.out.println("삼항 연산자");
        System.out.println("결과: " + result);
    }
}
