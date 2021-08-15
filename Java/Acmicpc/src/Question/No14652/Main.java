package Question.No14652;

import java.util.Scanner;

/*
Acmicpc 14652

- 나는 행복합니다~ (https://www.acmicpc.net/problem/14652)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
        System.out.println(k / m + " " + k % m);
    }
}
