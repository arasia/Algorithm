import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 이친수 (https://www.acmicpc.net/problem/2193)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            long[] dp = new long[N+1];

            if(N < 3) {
                bw.write("1");
            } else {
                dp[0] = 0;
                dp[1] = 1;
                dp[2] = 1;

                for(int i = 3 ; i <= N ; i++) {
                    dp[i] = dp[i-1] + dp[i-2];
                }

                bw.write(String.valueOf(dp[N]));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
