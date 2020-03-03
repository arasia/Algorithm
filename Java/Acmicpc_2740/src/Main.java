import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- 행렬 곱셈 (https://www.acmicpc.net/problem/2740)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[][] A = new int[N][M];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    A[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[][] B = new int[M][K];

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < K; j++) {
                    B[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] result = new int[N][K];

            for (int n = 0; n < N; n++) {
                for (int k = 0; k < K; k++) {
                    int current = 0;
                    for (int m = 0; m < M; m++) {
                        current += (A[n][m] * B[m][k]);
                    }
                    bw.write(current +" ");
                }
                bw.write("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
