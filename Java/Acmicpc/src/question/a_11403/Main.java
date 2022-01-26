package question.a_11403;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 11403

- 경로 찾기 (https://www.acmicpc.net/problem/11403)
*/
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (br) {
            int n = Integer.parseInt(br.readLine());
            int[][] pathMap = new int[n][n];

            initPathMap(br, n, pathMap);
            floydWarshall(n, pathMap);
            printPathMap(n, pathMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void initPathMap(BufferedReader br, int n, int[][] pathMap) throws IOException {
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                pathMap[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    private static void floydWarshall(int n, int[][] pathMap) {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (pathMap[i][k] == 1 && pathMap[k][j] == 1) {
                        pathMap[i][j] = 1;
                    }
                }
            }
        }
    }

    private static void printPathMap(int n, int[][] pathMap) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(pathMap[i][j])
                        .append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
