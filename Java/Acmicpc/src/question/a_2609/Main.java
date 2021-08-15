package question.a_2609;

import java.util.Scanner;

/*
Acmicpc 2609

- 최대공약수와 최소공배수 (https://www.acmicpc.net/problem/2609)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int gcd = gcd(a, b);

        System.out.println(gcd);
        System.out.println(a * b / gcd);
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
