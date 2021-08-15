package question.a_15920;

import java.util.Scanner;

/*
Acmicpc 15920

- 선로에 마네킹이야!! (https://www.acmicpc.net/problem/15920)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String input = sc.next();

        int time = 0;
        boolean lever = true;
        boolean both = false;

        for (int i = 0; i < N; i++) {
            char ch = input.charAt(i);

            if (ch == 'P') {
                if (time == 1) {
                    both = true;
                } else if (time < 1) {
                    lever = !lever;
                }
            } else {
                time++;
            }
        }

        if (time < 2) {
            System.out.println("0");
        } else {
            if (both) {
                System.out.println("6");
            } else {
                if (lever) {
                    System.out.println("5");
                } else {
                    System.out.println("1");
                }
            }
        }
    }
}
