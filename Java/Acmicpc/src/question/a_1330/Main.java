package question.a_1330;

import java.util.Scanner;

/*
Acmicpc
- 두 수 비교하기 (https://www.acmicpc.net/problem/1330)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        }

        if (A < B) {
            System.out.println("<");
        }

        if (A == B) {
            System.out.println("==");
        }
    }
}
