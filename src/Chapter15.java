
// Chapter15 - 자바 메모리 모델과 GC
public class Chapter15 {
    public static void main(String[] args) {
        // 객체 생성
        String data = new String("메모리 사용 예시");

        // 객체 사용
        System.out.println(data);

        // 명시적 GC 요청 (권장되지 않음)
        System.gc();
    }
}
