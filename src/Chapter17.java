// Chapter17 - Enum과 애너테이션
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

@interface Info {
    String author();
    String version();
}

@Info(author = "정기", version = "1.0")
public class Chapter17 {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println("오늘은 " + today);
    }
}
