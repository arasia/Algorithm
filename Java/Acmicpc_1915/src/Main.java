import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 1915

- 가장 큰 사각형 (https://www.acmicpc.net/problem/1915)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n, m;
            {
                String[] input = br.readLine().split(" ");
                n = Integer.parseInt(input[0]);
                m = Integer.parseInt(input[1]);
            }

            int[][] arr = new int[n + 1][m + 1];

            for (int i = 1; i <= n; i++) {
                String input = br.readLine();
                for (int j = 1; j <= m; j++) {
                    arr[i][j] = input.charAt(j-1) - '0';
                }
            }

            int result = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = 1 ; j <= m; j++) {
                    if (arr[i][j] != 0) {
                        arr[i][j] = Math.min(arr[i - 1][j - 1], Math.min(arr[i - 1][j], arr[i][j - 1])) + 1;
                        result = Math.max(result, arr[i][j]);
                    }
                }
            }

            bw.write(String.valueOf(result * result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
