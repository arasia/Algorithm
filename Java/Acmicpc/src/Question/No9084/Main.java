package Question.No9084;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 9084

- 동전 (https://www.acmicpc.net/problem/9084)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                int N = Integer.parseInt(br.readLine());
                int[] coin = new int[N + 1];

                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int i = 1; i <= N; i++) {
                    coin[i] = Integer.parseInt(st.nextToken());
                }

                int M = Integer.parseInt(br.readLine());
                int[] dp = new int[M + 1];

                dp[0] = 1;
                for (int i = 1; i <= N; i++) {
                    for (int j = coin[i]; j <= M; j++) {
                        dp[j] += dp[j - coin[i]];
                    }
                }

                bw.write(dp[M] + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
