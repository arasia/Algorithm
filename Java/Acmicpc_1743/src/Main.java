import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 1743

- 음식물 피하기 (https://www.acmicpc.net/problem/1743)
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
            int K = Integer.parseInt(st.nextToken());
            List<Point> list = new ArrayList<>();
            arr = new int[N + 2][M + 2];

            for (int i = 0; i < K; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                arr[x][y] = 1;
                list.add(new Point(x, y));
            }

            int max = 0;
            for (Point point : list) {
                max = Math.max(max, dfs(point.x, point.y));
            }

            bw.write(String.valueOf(max));
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
