import java.util.Scanner;

/*
Acmicpc 1373

- 2진수 8진수 (https://www.acmicpc.net/problem/1373)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int size = N.length();

        if (size % 3 != 0) {
            N = "0".repeat(3 - size % 3) + N;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i += 3) {
            sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i + 1) - '0') * 2 + (N.charAt(i + 2) - '0'));
        }

        System.out.println(sb.toString());
    }
}
