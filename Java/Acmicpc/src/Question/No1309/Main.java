package Question.No1309;

/*
Acmicpc 1309

- 동물원 (https://www.acmicpc.net/problem/1309)
*/
public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        int[][] dp = new int[N+1][3];
        java.util.Arrays.fill(dp[1], 1);

        for (int i = 2; i <= N; i++) {
            dp[i][0] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2]) % 9901;
            dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % 9901;
            dp[i][2] = (dp[i - 1][0] + dp[i - 1][1]) % 9901;
        }

        System.out.println((dp[N][0] + dp[N][1] + dp[N][2]) % 9901);
    }
}
