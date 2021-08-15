package Question.No14890;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 14890

- 경사로 (https://www.acmicpc.net/problem/14890)
*/
public class Main {

    static int N, L;
    static int[][] arr;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            L = Integer.parseInt(st.nextToken());
            arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int result = 0;
            for (int i = 0; i < N; i++) {
                if (lineChecker(i, 0, false)) {
                    result++;
                }

                if (lineChecker(0, i, true)) {
                    result++;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean lineChecker(int x, int y, boolean mode) {
        int[] line = new int[N];
        boolean[] visited = new boolean[N];

        for (int i = 0; i < N; i++) {
            line[i] = mode ? arr[x + i][y] : arr[x][y + i];
        }

        for (int i = 0; i < N - 1; i++) {
            int diff = line[i] - line[i + 1];
            if (Math.abs(diff) > 1) {
                return false;
            }

            if (diff == 0) {
                continue;
            }

            try {
                if (diff > 0) {
                    for (int j = i + 1; j <= i + L; j++) {
                        if (line[i + 1] != line[j] || visited[j]) {
                            return false;
                        }
                        visited[j] = true;
                    }
                } else {
                    for (int j = i; j > i - L; j--) {
                        if (line[i] != line[j] || visited[j]) {
                            return false;
                        }
                        visited[j] = true;
                    }
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                return false;
            }
        }

        return true;
    }
}
