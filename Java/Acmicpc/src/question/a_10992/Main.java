package question.a_10992;

import java.util.Scanner;

/*
Acmicpc 10992

- 별 찍기 - 17 (https://www.acmicpc.net/problem/10992)
 */
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();

        if (n == 1) {
            System.out.println("*");
            return;
        }

        sb.append(" ".repeat(n - 1)).append("*").append("\n");
        for (int i = 1; i < n - 1; i++) {
            sb.append(" ".repeat(n - i - 1)).append("*").append(" ".repeat(2 * i - 1)).append("*").append("\n");
        }
        sb.append("*".repeat(2 * n - 1));

        System.out.println(sb.toString());
    }
}
