package Question.No1010;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1010

- 다리 놓기 (https://www.acmicpc.net/problem/1010)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            long[][] dp = new long[31][31];
            for (int i = 1; i < 31; i++) {
                dp[1][i] = i;
            }

            for (int i = 2; i < 31; i++) {
                for (int j = i; j < 31; j++) {
                    if (i == j) {
                        dp[i][j] = 1;
                    } else if (j - i == 1) {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j - 2];
                    } else {
                        for (int k = j-1; k > i-2; k--) {
                            dp[i][j] += dp[i - 1][k];
                        }
                    }
                }
            }

            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                bw.write(dp[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
