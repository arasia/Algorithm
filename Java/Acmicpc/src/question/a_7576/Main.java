package question.a_7576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc
- 토마토 (https://www.acmicpc.net/problem/7576)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            String[][] container = new String[N][M];
            int count = 0;
            int maxCount = M * N;
            int maxDay = 0;
            Queue<Point> queue = new ArrayDeque<>();

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    container[i][j] = st.nextToken();
                    if (container[i][j].equals("1")) {
                        queue.add(new Point(j, i, 0));
                        count++;
                        continue;
                    }
                    if (container[i][j].equals("-1")) {
                        maxCount--;
                    }
                }
            }

            while (!queue.isEmpty()) {
                Point current = queue.poll();
                if (current.day > maxDay) {
                    maxDay = current.day;
                }

                if ((current.x > 0) && (container[current.y][current.x - 1].equals("0"))) {
                    container[current.y][current.x - 1] = "1";
                    count++;
                    queue.add(new Point(current.x - 1, current.y, current.day + 1));
                }

                if ((current.x < M - 1) && (container[current.y][current.x + 1].equals("0"))) {
                    container[current.y][current.x + 1] = "1";
                    count++;
                    queue.add(new Point(current.x + 1, current.y, current.day + 1));
                }

                if ((current.y > 0) && (container[current.y - 1][current.x].equals("0"))) {
                    container[current.y - 1][current.x] = "1";
                    count++;
                    queue.add(new Point(current.x, current.y - 1, current.day + 1));
                }

                if ((current.y < N - 1) && (container[current.y + 1][current.x].equals("0"))) {
                    container[current.y + 1][current.x] = "1";
                    count++;
                    queue.add(new Point(current.x, current.y + 1, current.day + 1));
                }
            }

            if (count == maxCount) {
                bw.write(String.valueOf(maxDay));
            } else {
                bw.write("-1");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Point {
        private int x;
        private int y;
        private int day;

        public Point(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
}
