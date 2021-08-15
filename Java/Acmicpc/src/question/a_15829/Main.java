package question.a_15829;

import java.util.Scanner;

/*
Acmicpc 15829

- Hashing (https://www.acmicpc.net/problem/15829)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), r = 31, M = 1234567891;
        long result = 0, ri = 1;
        String input = sc.next();

        for (int i = 0; i < L; i++) {
            result += ((input.charAt(i) - 'a' + 1) * ri) % M;
            ri = (ri * r) % M;
        }

        System.out.println(result % M);
    }
}
