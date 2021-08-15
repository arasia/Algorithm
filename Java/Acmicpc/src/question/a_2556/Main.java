package question.a_2556;

import java.util.Scanner;
import java.util.stream.IntStream;

/*
Acmicpc 2556

- 별 찍기 - 14 (https://www.acmicpc.net/problem/2556)
*/
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();

        IntStream.rangeClosed(1, n).forEach(i -> sb.append("*".repeat(n)).append("\n"));

        System.out.println(sb.toString());
    }
}
