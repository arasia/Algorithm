import java.util.Scanner;
import java.util.stream.IntStream;

/*
Acmicpc 10990

- 별 찍기 - 15 (https://www.acmicpc.net/problem/10990)
*/
public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        StringBuilder sb = new StringBuilder();

        sb.append(" ".repeat(n - 1)).append("*").append("\n");

        IntStream.rangeClosed(2, n)
                .forEach(i ->
                        sb.append(" ".repeat(n - i))
                                .append("*")
                                .append(" ".repeat(2 * (i - 2) + 1))
                                .append("*")
                                .append("\n")
                );

        System.out.println(sb.toString());
    }
}
