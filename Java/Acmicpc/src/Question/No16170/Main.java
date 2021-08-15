package Question.No16170;

/*
Acmicpc 16170

- 오늘의 날짜는? (https://www.acmicpc.net/problem/16170)
*/
public class Main {
    public static void main(String[] args) {
        java.time.ZonedDateTime date = java.time.ZonedDateTime.now(java.time.ZoneId.of("UTC"));
        System.out.println(date.getYear() + "\n" + String.format("%02d", date.getMonthValue()) + "\n" + date.getDayOfMonth());
    }
}
