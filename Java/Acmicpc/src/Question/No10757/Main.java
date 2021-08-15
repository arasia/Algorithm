package Question.No10757;

import java.math.BigDecimal;
import java.util.Scanner;

/*
Acmicpc
- A^B (https://www.acmicpc.net/problem/10827)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal A = sc.nextBigDecimal();
        int B = sc.nextInt();
        BigDecimal result = A.pow(B);
        System.out.println(result.toPlainString());
    }
}
