package question.a_19944;

import java.util.Scanner;

/*
Acmicpc 19944

- 뉴비의 기준은 뭘까? (https://www.acmicpc.net/problem/19944)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        if (M <= N) {
            if (M < 3) {
                System.out.println("NEWBIE!");
            } else {
                System.out.println("OLDBIE!");
            }
        } else {
            System.out.println("TLE!");
        }
    }
}
