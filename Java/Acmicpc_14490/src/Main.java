/*
Acmicpc 14490

- 백대열 (https://www.acmicpc.net/problem/14490)
*/
public class Main {
    public static void main(String[] args) {
        String[] input = new java.util.Scanner(System.in).next().split(":");
        int a = Integer.parseInt(input[0]), b = Integer.parseInt(input[1]);
        int gcd = gcd(a, b);

        System.out.println(a / gcd + ":" + b / gcd);
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
