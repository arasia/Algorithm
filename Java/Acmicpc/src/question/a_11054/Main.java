package question.a_11054;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 11054

- 가장 긴 바이토닉 부분 수열 (https://www.acmicpc.net/problem/11054)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int[][] dp = new int[N][2];

            dp[0][0] = 1;
            dp[N - 1][1] = 1;

            for (int i = 1; i < N; i++) {
                dp[i][0] = 1;
                for (int j = 0; j < i; j++) {
                    if (list.get(i) > list.get(j)) {
                        dp[i][0] = Math.max(dp[i][0], (dp[j][0] + 1));
                    }
                }
            }

            for (int i = N - 2; i >= 0; i--) {
                dp[i][1] = 1;
                for (int j = N - 1; j > i; j--) {
                    if (list.get(i) > list.get(j)) {
                        dp[i][1] = Math.max(dp[i][1], (dp[j][1] + 1));
                    }
                }
            }

            int[] result = new int[N];
            for (int i = 0; i < N; i++) {
                result[i] = dp[i][0] + dp[i][1];
            }

            Arrays.sort(result);
            bw.write(String.valueOf(result[N - 1] - 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
