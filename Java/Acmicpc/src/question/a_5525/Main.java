package question.a_5525;

import java.util.Scanner;

/*
Acmicpc 5525

- IOIOI (https://www.acmicpc.net/problem/5525)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int length = sc.nextInt();
        char[] chars = sc.next().toCharArray();

        int[] dp = new int[length];
        int result = 0;

        for (int i = 1; i < length - 1; i++) {
            if (chars[i] == 'O' && chars[i + 1] == 'I') {
                dp[i + 1] = dp[i - 1] + 1;
            }

            if (dp[i + 1] >= target && chars[i - 2 * target + 1] == 'I') {
                result++;
            }
        }

        System.out.println(result);
    }
}
