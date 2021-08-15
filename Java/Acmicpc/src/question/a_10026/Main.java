package question.a_10026;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 10026

- 적록색약 (https://www.acmicpc.net/problem/10026)
*/
public class Main {
    static char[][] data;
    static boolean[][] check;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            data = new char[N + 2][N + 2];
            check = new boolean[N + 2][N + 2];

            for (int i = 1; i <= N; i++) {
                String current = br.readLine();
                int len = current.length();
                for (int j = 0; j < len; j++) {
                    data[i][j + 1] = current.charAt(j);
                }
            }

            int result = 0;
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (!check[i][j]) {
                        dfs(i, j, data[i][j]);
                        result++;
                    }
                }
            }

            bw.write(result + " ");

            for (int i = 1; i <=N ; i++) {
                for (int j = 1; j <= N; j++) {
                    if (data[i][j] == 'G') {
                        data[i][j] = 'R';
                    }
                }
            }

            result = 0;
            check = new boolean[N + 2][N + 2];
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (!check[i][j]) {
                        dfs(i, j, data[i][j]);
                        result++;
                    }
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dfs(int i, int j, char c) {
        if (data[i + 1][j] == c && !check[i + 1][j]) {
            check[i + 1][j] = true;
            dfs(i + 1, j, c);
        }
        if (data[i - 1][j] == c && !check[i - 1][j]) {
            check[i - 1][j] = true;
            dfs(i - 1, j, c);
        }
        if (data[i][j + 1] == c && !check[i][j + 1]) {
            check[i][j + 1] = true;
            dfs(i, j + 1, c);
        }
        if (data[i][j - 1] == c && !check[i][j - 1]) {
            check[i][j - 1] = true;
            dfs(i, j - 1, c);
        }
    }
}
