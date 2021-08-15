package question.a_2522;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
Acmicpc 2522

- 별 찍기 - 12 (https://www.acmicpc.net/problem/2522)
*/
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();

        IntStream.range(1, n).forEach(i -> sb.append(" ".repeat(n - i)).append("*".repeat(i)).append("\n"));

        for (int i = n; i > 0; i--) {
            sb.append(" ".repeat(n - i)).append("*".repeat(i)).append("\n");
        }

        System.out.println(sb.toString());
    }
}
