package question.a_10991;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
Acmicpc 10991

- 별 찍기 - 16 (https://www.acmicpc.net/problem/10991)
*/
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();

        IntStream.rangeClosed(1, n)
                .forEach(i ->
                        sb.append(" ".repeat(n - i))
                                .append("* ".repeat(i - 1))
                                .append("*\n")
                );

        System.out.println(sb.toString());
    }
}
