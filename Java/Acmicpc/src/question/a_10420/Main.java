package question.a_10420;

import java.util.Calendar;

/*
Acmicpc 10420

- 기념일 1 (https://www.acmicpc.net/problem/10420)
*/
public class Main {
    public static void main(String[] args) {
        Calendar cal =  Calendar.getInstance();
        cal.set(2014, Calendar.APRIL, 2);
        cal.add(Calendar.DATE, new java.util.Scanner(System.in).nextInt() - 1);
        System.out.println(new java.text.SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
    }
}
