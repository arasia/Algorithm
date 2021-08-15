package Question.No15740;

import java.math.BigInteger;
import java.util.Scanner;

/*
Acmicpc
- A + B - 9 (https://www.acmicpc.net/problem/15740)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        BigInteger result = A.add(B);
        System.out.println(result.toString());
    }
}
