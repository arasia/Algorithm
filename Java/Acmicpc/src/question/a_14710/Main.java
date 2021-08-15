package question.a_14710;

import java.util.Scanner;

/*
Acmicpc 14710

- 고장난 시계 (https://www.acmicpc.net/problem/14710)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), m = sc.nextInt();

        if (((h % 30) * 12) == m) {
            System.out.print("O");
        } else {
            System.out.print("X");
        }
    }
}
