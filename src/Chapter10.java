// Chapter10 - 배열과 컬렉션
import java.util.ArrayList;
import java.util.Arrays;

public class Chapter10 {
    public static void main(String[] args) {
        // 배열 예제
        int[] numbers = {1, 2, 3};
        System.out.println("배열: " + Arrays.toString(numbers));

        // ArrayList 예제
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println("리스트: " + list);
    }
}
