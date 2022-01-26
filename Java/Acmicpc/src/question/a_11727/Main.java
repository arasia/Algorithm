package question.a_11727;

/*
Acmicpc 11727
f
- 2xn 타일링 2 (https://www.acmicpc.net/problem/11727)
*/
public class Main {
    public static final int MOD = 10_007;

    public static void main(String[] args) {
        int length = new java.util.Scanner(System.in).nextInt();
        System.out.println(solve(length));
    }

    private static int solve(int length) {
        if (length == 1) {
            return 1;
        }

        int[] dp = new int[length + 1];
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= length; i++) {
            dp[i] = ((dp[i - 1] % MOD) + ((dp[i - 2] * 2) % MOD)) % MOD;
        }

        return dp[length];
    }
}
