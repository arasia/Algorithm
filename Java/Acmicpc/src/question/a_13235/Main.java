package question.a_13235;

import java.util.Scanner;

/*
Acmicpc 13235

- 펠린드롬 (https://www.acmicpc.net/problem/13235)
*/
public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        int left = 0, right = input.length()-1;
        boolean result = true;

        while (left < right) {
            if (input.charAt(left++) != input.charAt(right--)) {
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
