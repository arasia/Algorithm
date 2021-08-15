package Question.No18111;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 18111

- 마인크래프트 (https://www.acmicpc.net/problem/18111)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            int[][] land = new int[N][M];

            int maxHeight = 0, minHeight = Integer.MAX_VALUE;

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    land[i][j] = Integer.parseInt(st.nextToken());
                    maxHeight = Math.max(maxHeight, land[i][j]);
                    minHeight = Math.min(minHeight, land[i][j]);
                }
            }

            int resultTime = Integer.MAX_VALUE, resultHeight = Integer.MAX_VALUE;

            for (int i = minHeight; i <= maxHeight ; i++) {
                int time = 0;
                int block = B;

                for (int j = 0; j < N; j++) {
                    for (int k = 0; k < M; k++) {
                        int diffHeight = land[j][k] - i;
                        if (diffHeight > 0) {
                            time += diffHeight * 2;
                            block = block + diffHeight;
                        } else if (diffHeight < 0) {
                            time -= diffHeight;
                            block += diffHeight;
                        }
                    }
                }

                if ((block >= 0) && (time <= resultTime)) {
                    resultTime = time;
                    resultHeight = i;
                }
            }

            bw.write(resultTime + " " + resultHeight);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
