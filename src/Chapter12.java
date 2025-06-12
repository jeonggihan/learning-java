// Chapter12 - 입출력 (I/O)
import java.io.*;

public class Chapter12 {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        // 파일에 쓰기
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, Java I/O!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 파일에서 읽기
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            System.out.println("읽은 내용: " + line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}