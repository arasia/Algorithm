package Question.No4963;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 4963

- 섬의 갯수 (https://www.acmicpc.net/problem/4963)
*/
public class Main {

    static int[][] arr;
    static List<Point> list;
    
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

                if ((N == 0) && (M == 0)) {
                    break;
                }

                arr = new int[M + 2][N + 2];
                list = new ArrayList<>();

                for (int i = 1; i <= M; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 1; j <= N; j++) {
                        String current = st.nextToken();
                        arr[i][j] = Integer.parseInt(current);

                        if (current.equals("1")) {
                            list.add(new Point(j, i));
                        }
                    }
                }
                
                int result = 0;
                for (Point point : list) {
                    if (arr[point.y][point.x] == 1) {
                        result++;
                        dfs(point.x, point.y);
                    }
                }

                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dfs(int x, int y) {
        arr[y][x] = 0;

        if (arr[y - 1][x - 1] == 1) {
            dfs(x - 1, y - 1);
        }
        if (arr[y - 1][x] == 1) {
            dfs(x, y - 1);
        }
        if (arr[y - 1][x + 1] == 1) {
            dfs(x + 1, y - 1);
        }
        if (arr[y][x - 1] == 1) {
            dfs(x - 1, y);
        }
        if (arr[y][x + 1] == 1) {
            dfs(x + 1, y);
        }
        if (arr[y + 1][x - 1] == 1) {
            dfs(x - 1, y + 1);
        }
        if (arr[y + 1][x] == 1) {
            dfs(x, y + 1);
        }
        if (arr[y + 1][x + 1] == 1) {
            dfs(x + 1, y + 1);
        }
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
