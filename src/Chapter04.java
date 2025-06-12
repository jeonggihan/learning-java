public class Chapter04 {
    public static void main(String[] args) {

        // 1. 조건문 (if / else if / else)
        int score = 85;
        System.out.println("조건문 - if / else if / else");
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }

        // switch 문
        String grade = "B";
        System.out.println("\n조건문 - switch");
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            default:
                System.out.println("Needs improvement");
        }

        // 2. 반복문

        // for 문
        System.out.println("\n반복문 - for");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // 향상된 for-each 문
        System.out.println("\n반복문 - 향상된 for-each");
        String[] names = {"Alice", "Bob", "Charlie"};
        for (String name : names) {
            System.out.println(name);
        }

        // while 문
        System.out.println("\n반복문 - while");
        int i = 0;
        while (i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        // do-while 문
        System.out.println("\n반복문 - do-while");
        int j = 0;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j < 5);

        // 3. 흐름 제어 키워드

        // break / continue 예제
        System.out.println("\n흐름 제어 - break, continue");
        for (int k = 0; k < 10; k++) {
            if (k % 2 == 0) continue;
            if (k > 7) break;
            System.out.println("k = " + k);
        }

        // 라벨이 있는 continue 예제
        System.out.println("\n흐름 제어 - 라벨이 있는 continue");
        outerLoop:
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == col) {
                    continue outerLoop;
                }
                System.out.println("row=" + row + ", col=" + col);
            }
        }

        // return 예제
        System.out.println("\n흐름 제어 - return");
        printMessage();
    }

    static void printMessage() {
        System.out.println("메서드 실행 중입니다.");
        return;
    }
}
