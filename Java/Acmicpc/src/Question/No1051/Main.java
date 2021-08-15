package Question.No1051;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1051

- 숫자 정사각형 (https://www.acmicpc.net/problem/1051)
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
            int[][] arr = new int[N][M];

            for (int i = 0; i < N; i++) {
                String line = br.readLine();
                for (int j = 0; j < M; j++) {
                    arr[i][j] = line.charAt(j) - '0';
                }
            }

            int result = -1;
            int maxLen = Math.max(N, M);

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    for (int len = 0; len < maxLen ; len++) {
                        if (i + len < N && j + len < M) {
                            if ((arr[i][j] == arr[i + len][j])
                                    && (arr[i][j] == arr[i][j + len])
                                    && (arr[i][j] == arr[i + len][j + len])) {
                                result = Math.max(result, len);
                            }
                        }
                    }
                }
            }

            bw.write(String.valueOf((result + 1) * (result + 1)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
