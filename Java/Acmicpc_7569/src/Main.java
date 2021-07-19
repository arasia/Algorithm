import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 7569

- 토마토 (https://www.acmicpc.net/problem/7569)
 */
public class Main {
    static int[][] checker = {{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
    static int[][][] arr;
    static List<Point> startPoint = new ArrayList<>();
    static int tomatoCount = 0;
    static int emptyCount = 0;


    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            arr = new int[m][n][h];

            getInputData(br, m, n, h);

            int depth = bfs(0);

            if (tomatoCount == ((m * n * h) - emptyCount)) {
                bw.write(String.valueOf(depth));
            } else {
                bw.write("-1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void getInputData(BufferedReader br, int m, int n, int h) throws IOException {
        StringTokenizer st;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                st = new StringTokenizer(br.readLine());
                for (int k = 0; k < m; k++) {
                    int area = Integer.parseInt(st.nextToken());
                    if (area == -1) {
                        emptyCount++;
                    }

                    if (area == 1) {
                        startPoint.add(new Point(k, j, i));
                        tomatoCount++;
                    }

                    arr[k][j][i] = area;
                }
            }
        }
    }

    private static int bfs(int depth) {
        List<Point> nextList = new ArrayList<>();

        for (Point point : startPoint) {
            for (int i = 0; i < 6; i++) {
                int checkX = point.x + checker[i][0];
                int checkY = point.y + checker[i][1];
                int checkZ = point.z + checker[i][2];

                try {
                    if (arr[checkX][checkY][checkZ] == 0) {
                        arr[checkX][checkY][checkZ] = 1;
                        tomatoCount++;
                        nextList.add(new Point(checkX, checkY, checkZ));
                    }
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
        }

        if (nextList.isEmpty()) {
            return depth;
        } else {
            startPoint = nextList;
            return bfs(depth + 1);
        }
    }

    public static class Point {
        int x;
        int y;
        int z;

        public Point(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }

}
