package question.a_14681;

import java.util.Scanner;

/*
Acmicpc 14681

- 사분면 고르기 (https://www.acmicpc.net/problem/14681)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        String result;

        if (x > 0) {
            if (y > 0) {
                result = "1";
            } else {
                result = "4";
            }
        } else {
            if (y > 0) {
                result = "2";
            } else {
                result = "3";
            }
        }
        System.out.println(result);
    }
}
