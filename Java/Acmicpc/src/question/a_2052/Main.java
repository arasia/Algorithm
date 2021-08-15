package question.a_2052;

import java.math.BigDecimal;

/*
Acmicpc 2052

- 지수연산 (https://www.acmicpc.net/problem/2052)
*/
public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        BigDecimal result = new BigDecimal("1");

        while (N-- > 0) {
            result = result.divide(new BigDecimal("2"));
        }

        System.out.println(result.toPlainString());
    }
}
