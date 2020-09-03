/*
Acmicpc 10870

- 피보나치 수 5 (https://www.acmicpc.net/problem/10870)
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(fibo(new java.util.Scanner(System.in).nextInt()));
    }

    private static int fibo(int n) {
        if (n < 2) {
            return n;
        } else if (n == 2) {
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }
}
