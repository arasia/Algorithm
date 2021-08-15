package question.a_2745;

import java.util.Scanner;

/*
Acmicpc 2745

- 진법 변환 (https://www.acmicpc.net/problem/2745)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = sc.nextInt();
        int p = 1;
        int result = 0;

        for (int i = input.length() -1; i >= 0 ; i--) {
            char ch = input.charAt(i);
            if (ch < 58) {
                result += (ch - 48) * p;
            } else {
                result += (ch - 55) * p;
            }
            p *= n;
        }

        System.out.println(result);
    }
}
