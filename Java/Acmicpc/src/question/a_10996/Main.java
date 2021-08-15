package question.a_10996;

/*
Acmicpc 10996

- 별 찍기 - 21 (https://www.acmicpc.net/problem/10996)
*/
public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        if (N == 1) {
            System.out.println("*");
            return;
        }

        StringBuilder sb = new StringBuilder();
        boolean star = true;
        for (int i = 0; i < N; i++) {
            if (star) {
                sb.append("*");
            } else {
                sb.append(" ");
            }
            star = !star;
        }
        String str1 = sb.append("\n").toString();

        StringBuilder sb2 = new StringBuilder();
        star = false;
        for (int i = 0; i < N; i++) {
            if (star) {
                sb2.append("*");
            } else {
                sb2.append(" ");
            }
            star = !star;
        }
        String str2 = sb2.append("\n").toString();

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            result.append(str1);
            result.append(str2);
        }

        System.out.println(result.toString());
    }
}
