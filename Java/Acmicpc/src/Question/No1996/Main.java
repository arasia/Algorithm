package Question.No1996;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 1996

- 지뢰 찾기 (https://www.acmicpc.net/problem/1996)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[][] map = new int[N + 2][N + 2];

            for (int i = 1; i <= N; i++) {
                String input = br.readLine();

                for (int j = 1; j <= N; j++) {
                    char c = input.charAt(j-1);

                    if (c == '.') {
                        continue;
                    }

                    int n = c - '0';
                    map[i][j] = Integer.MIN_VALUE;

                    map[i - 1][j - 1] += n;
                    map[i - 1][j] += n;
                    map[i - 1][j + 1] += n;
                    map[i][j - 1] += n;
                    map[i][j + 1] += n;
                    map[i + 1][j - 1] += n;
                    map[i + 1][j] += n;
                    map[i + 1][j + 1] += n;
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (map[i][j] < 0) {
                        sb.append("*");
                    } else if (map[i][j] > 9) {
                        sb.append("M");
                    } else {
                        sb.append(map[i][j]);
                    }
                }

                sb.append("\n");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
