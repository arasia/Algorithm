import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 01타일 (https://www.acmicpc.net/problem/1904)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[][] dp = new int[N + 1][2];

            if (N < 3) {
                bw.write(String.valueOf(N));
            } else {
                dp[0][0] = 0;
                dp[0][1] = 0;
                dp[1][0] = 0;
                dp[1][1] = 1;
                dp[2][0] = 1;
                dp[2][1] = 1;

                for (int i = 3; i <= N; i++) {
                    dp[i][0] = (dp[i - 2][0] + dp[i - 2][1]) % 15746;
                    dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % 15746;
                }

                bw.write(String.valueOf((dp[N][0] + dp[N][1]) % 15746));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
