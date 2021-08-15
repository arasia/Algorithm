package Question.No2942;

import java.util.Scanner;

/*
Acmicpc 2942

- 퍼거슨과 사과 (https://www.acmicpc.net/problem/2942)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt(), G = sc.nextInt();
        int gcd = gcd(R, G);
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= gcd ; i++) {
            if (gcd % i == 0) {
                result.append(i).append(" ").append(R / i).append(" ").append(G / i).append("\n");
            }
        }

        System.out.println(result.toString());
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
