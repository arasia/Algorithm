import java.util.Scanner;

/*
Acmicpc 1476

- 날짜 계산 (https://www.acmicpc.net/problem/1476)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int e = sc.nextInt() - 1, s = sc.nextInt() - 1, m = sc.nextInt() - 1, year = 0;

        while (true) {
            int te = year % 15, ts = year % 28, tm = year % 19;
            if((te == e) && (ts == s) && (tm == m))
                break;
            year++;
        }

        System.out.println(year+1);
    }
}
