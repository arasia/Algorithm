package question.a_1926;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 1926

- 그림 (https://www.acmicpc.net/problem/1926)
*/
public class Main {

    static int[][] arr;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            List<Point> list = new ArrayList<>();
            arr = new int[N + 2][M + 2];

            for (int i = 1; i <= N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= M; j++) {
                    if (st.nextToken().equals("1")) {
                        arr[i][j] = 1;
                        list.add(new Point(i, j));
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }

            int count = 0;
            int max = 0;
            for (Point point : list) {
                int dfs = dfs(point.x, point.y);
                if (dfs > 0) {
                    max = Math.max(max, dfs);
                    count++;
                }
            }

            bw.write(count + "\n" + max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int dfs(int x, int y) {
        if (arr[x][y] != 1) {
            return 0;
        }

        arr[x][y]++;
        int result = 1;
        result += dfs(x + 1, y);
        result += dfs(x - 1, y);
        result += dfs(x, y + 1);
        result += dfs(x, y - 1);

        return result;
    }

    private static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
