package Question.No1254;

import java.util.Scanner;

/*
Acmicpc 1254

- 팰린드롬 만들기 (https://www.acmicpc.net/problem/1254)
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(func(new Scanner(System.in).nextLine()));
    }

    private static int func(String input) {
        int len = input.length();

        for (int i = 0; i < len; i++) {
            if (check(input.substring(i))) {
                return i + len;
            }
        }
        return len * 2;
    }

    private static boolean check(String input) {
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
