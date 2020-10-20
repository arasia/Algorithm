/*
Acmicpc 8741

- 이진수 합 (https://www.acmicpc.net/problem/8741)
*/
public class Main {
    public static void main(String[] args) {
        int n = new java.util.Scanner(System.in).nextInt();
        System.out.println("1".repeat(n) + "0".repeat(n - 1));
    }
}
