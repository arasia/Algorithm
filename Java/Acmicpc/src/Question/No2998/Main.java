package Question.No2998;

import java.util.Scanner;

/*
Acmicpc 2998

- 8진수 (https://www.acmicpc.net/problem/2998)
*/
public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int len = input.length();
        int sub = len % 3;
        StringBuilder sb = new StringBuilder();

        if (sub != 0) {
            sb.append(Integer.parseInt("0".repeat(3 - sub) + input.substring(0, sub), 2));
        }

        for (int i = sub; i < len; i = i+3) {
            sb.append(Integer.parseInt(input.substring(i, i+3), 2));
        }

        System.out.println(sb.toString());
    }
}
