package question.a_2665;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

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
Acmicpc 2665

- 미로만들기 (https://www.acmicpc.net/problem/2665)
*/
public class Main {
    static int boardSize;
    static int[][] board;
    static int[][] dist;

    public static void main(String[] args) {
        initInput();
        System.out.println(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            boardSize = Integer.parseInt(br.readLine());
            board = new int[boardSize][boardSize];
            dist = new int[boardSize][boardSize];

            for (int i = 0; i < boardSize; i++) {
                String inputLine = br.readLine();
                for (int j = 0; j < boardSize; j++) {
                    board[i][j] = inputLine.charAt(j) - '0';
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        dist[0][0] = 0;

        while (!queue.isEmpty()) {
            Point currentPoint = queue.poll();
            final int currentDist = dist[currentPoint.x][currentPoint.y];

            for (FourPoint fourPoint : FourPoint.values()) {
                final int nextX = currentPoint.x + fourPoint.getX();
                final int nextY = currentPoint.y + fourPoint.getY();

                if (isInbound(nextX, nextY) && dist[nextX][nextY] > currentDist) {
                    dist[nextX][nextY] = currentDist + (board[nextX][nextY] == 0 ? 1 : 0);
                    queue.add(new Point(nextX, nextY));
                }
            }
        }

        return dist[boardSize - 1][boardSize - 1];
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
