package question.a_17626;

/*
Acmicpc 17626

- Four Squares (https://www.acmicpc.net/problem/17626)
*/
public class Main {
    public static void main(String[] args) {
        int target = new java.util.Scanner(System.in).nextInt();
        int[] dp = new int[target + 1];

        for (int i = 1; i <= target ; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 1; j * j <= i ; j++) {
                min = Math.min(min, dp[i - j * j]);
            }

            dp[i] = min + 1;
        }

        System.out.println(dp[target]);
    }
}
