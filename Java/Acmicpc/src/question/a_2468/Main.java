package question.a_2468;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

enum FourPoint {
    NORTH(0, -1), SOUTH(0, 1), WEST(-1, 0), EAST(1, 0);

    private final int x;
    private final int y;

    FourPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

/*
Acmicpc 2468

- 안전 영역 (https://www.acmicpc.net/problem/2468)
*/
public class Main {
    static int boardSize;
    static int[][] board;
    static boolean[][] visit;
    static Set<Integer> depths;

    public static void main(String[] args) {
        initInput();
        System.out.println(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            boardSize = Integer.parseInt(br.readLine());
            board = new int[boardSize][boardSize];
            depths = new HashSet<>();

            depths.add(0);

            for (int i = 0; i < boardSize; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int j = 0; j < boardSize; j++) {
                    int height = Integer.parseInt(st.nextToken());
                    board[i][j] = height;
                    depths.add(height);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        int result = 0;

        for (Integer depth : depths) {
            result = Math.max(result, findSafeArea(depth));
        }

        return result;
    }

    private static int findSafeArea(Integer depth) {
        int count = 0;
        visit = new boolean[boardSize][boardSize];

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (board[i][j] < depth) {
                    visit[i][j] = true;
                }
            }
        }

        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                if (!visit[i][j]) {
                    bfs(new Point(j, i));
                    count++;
                }
            }
        }

        return count;
    }

    private static void bfs(Point startPoint) {
        Queue<Point> queue = new LinkedList<>();
        queue.add(startPoint);
        visit[startPoint.y][startPoint.x] = true;

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();

            for (FourPoint fourPoint : FourPoint.values()) {
                int nextX = currentPoint.x + fourPoint.getX();
                int nextY = currentPoint.y + fourPoint.getY();

                if (isInbound(nextX, nextY) && !visit[nextY][nextX]) {
                    visit[nextY][nextX] = true;
                    queue.add(new Point(nextX, nextY));
                }
            }
        }
    }

    private static boolean isInbound(final int nextX, final int nextY) {
        return nextX >= 0 && nextX < boardSize && nextY >= 0 && nextY < boardSize;
    }
}

class Point {
    final int x;
    final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
