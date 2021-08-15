package Question.No7562;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 7562

- 나이트의 이동 (https://www.acmicpc.net/problem/7562)
 */
public class Main {
    static int[][] board;
    static Point startPoint;
    static Point finishPoint;
    static Queue<Point> searchQueue;
    static int[][] checker = {{-2, 1}, {-2, -1}, {-1, 2}, {-1, -2}, {1, 2}, {1, -2}, {2, 1}, {2, -1}};

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int testCase = Integer.parseInt(br.readLine());
            while (testCase-- > 0) {
                bw.write(solution(br) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solution(BufferedReader br) throws IOException {
        int width = Integer.parseInt(br.readLine());
        board = new int[width][width];
        StringTokenizer st = new StringTokenizer(br.readLine());
        startPoint = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        st = new StringTokenizer(br.readLine());
        finishPoint = new Point(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));

        if (startPoint.equals(finishPoint)) {
            return 0;
        }

        searchQueue = new ArrayDeque<>();
        searchQueue.add(startPoint);

        return bfs(1);
    }

    private static int bfs(int depth) {
        Queue<Point> nextSearchQueue = new ArrayDeque<>();

        while (!searchQueue.isEmpty()) {
            Point current = searchQueue.poll();

            if (current.equals(finishPoint)) {
                return depth;
            }

            for (int i = 0; i < 8; i++) {
                int checkX = current.x + checker[i][0];
                int checkY = current.y + checker[i][1];

                if (finishPoint.x == checkX && finishPoint.y == checkY) {
                    return depth;
                }

                try {
                    if (board[checkX][checkY] == 0) {
                        board[checkX][checkY] = 1;
                        nextSearchQueue.add(new Point(checkX, checkY));
                    }
                } catch (ArrayIndexOutOfBoundsException ignore) {
                }
            }
        }

        searchQueue = nextSearchQueue;
        return bfs(depth + 1);
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Point point) {
            return (this.x == point.x) && (this.y == point.y);
        }
    }
}
