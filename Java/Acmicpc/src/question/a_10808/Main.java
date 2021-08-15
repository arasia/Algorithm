package question.a_10808;

import java.util.Scanner;

/*
Acmicpc 10808

- 알파벳 개수 (https://www.acmicpc.net/problem/10808)
*/
public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int[] arr = new int[26];
        int len = input.length();

        for (int i = 0; i < len; i++) {
            arr[input.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}
