// Chapter11 - 문자열 처리
public class Chapter11 {

    private final static String flag = "Y";
    public static void main(String[] args) {
        String text = " Java Programming ";

        System.out.println("원본: [" + text + "]");
        System.out.println("trim: [" + text.trim() + "]");
        System.out.println("toUpperCase: " + text.toUpperCase());
        System.out.println("contains 'Java': " + text.contains("Java"));
        System.out.println("replace: " + text.replace(" ", ""));
        System.out.println("immutable string memory saving : " + flag);

        // 텍스트 블록 (Java 15+)
        String name = "홍길동";
        String multiLine = String.format("""
            이름: %s
            직업: 개발자
            언어: Java
            """, name);

        System.out.println("텍스트 블록:\n" + multiLine);

        // 텍스트 블록 값 변경 (replace 사용)
        String replaced = multiLine.replace("Java", "Kotlin");
        System.out.println("변경된 텍스트 블록:\n" + replaced);
    }
}
