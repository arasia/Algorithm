package Question.No14624;

import java.util.Scanner;

/*
Acmicpc 14624

- 전북대학교 (https://www.acmicpc.net/problem/14624)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (N % 2 == 0) {
            System.out.println("I LOVE CBNU");
            return;
        }
        int half = N / 2;

        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(N)).append("\n");
        sb.append(" ".repeat(half)).append("*").append("\n");

        for (int i = half - 1; i >= 0; i--) {
            sb.append(" ".repeat(i)).append("*").append(" ".repeat(2 * (half - i - 1) + 1)).append("*").append("\n");
        }

        System.out.println(sb.toString());
    }
}
