package Question.No1629;

import java.util.Scanner;

/*
Acmicpc 1629

- 곱셈 (https://www.acmicpc.net/problem/1629)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong(), B = sc.nextLong(), C = sc.nextLong();
        System.out.println(func(A % C, B, C));
    }

    static long func(long a, long b, long c) {
        if (b == 1) {
            return a;
        }

        long temp = func(a, b / 2, c) % c;

        if (b % 2 == 0) {
            return (temp * temp) % c;
        } else {
            return (((temp * temp) % c) * a) % c;
        }
    }
}
