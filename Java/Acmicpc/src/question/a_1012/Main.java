package question.a_1012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc
- 유기농 배추 (https://www.acmicpc.net/problem/1012)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            while ((T--) > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int M = Integer.parseInt(st.nextToken());
                int N = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());
                int result = 0;

                int[][] map = new int[M][N];
                List<Point> list = new ArrayList<>();

                for (int i = 0; i < M; i++) {
                    Arrays.fill(map[i], 0);
                }

                while ((K--) > 0) {
                    st = new StringTokenizer(br.readLine());
                    int x = Integer.parseInt(st.nextToken());
                    int y = Integer.parseInt(st.nextToken());

                    map[x][y] = 1;
                    list.add(new Point(x, y));
                }

                for (Point point : list) {
                    if (map[point.x][point.y] == 1) {
                        result++;

                        Queue<Point> queue = new ArrayDeque<>();
                        queue.add(point);
                        map[point.x][point.y] = 0;

                        while (!queue.isEmpty()) {
                            Point currentPoint = queue.poll();
                            int currentX = currentPoint.x;
                            int currentY = currentPoint.y;

                            if ((currentX > 0) && (map[currentX - 1][currentY] == 1)) {
                                queue.add(new Point(currentX - 1, currentY));
                                map[currentX - 1][currentY] = 0;
                            }
                            if ((currentX < M - 1) && (map[currentX + 1][currentY] == 1)) {
                                queue.add(new Point(currentX + 1, currentY));
                                map[currentX + 1][currentY] = 0;
                            }
                            if ((currentY > 0) && (map[currentX][currentY - 1] == 1)) {
                                queue.add(new Point(currentX, currentY - 1));
                                map[currentX][currentY - 1] = 0;
                            }
                            if ((currentY < N - 1) && (map[currentX][currentY + 1] == 1)) {
                                queue.add(new Point(currentX, currentY + 1));
                                map[currentX][currentY + 1] = 0;
                            }
                        }
                    }
                }
                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
