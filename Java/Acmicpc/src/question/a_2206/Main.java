package question.a_2206;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 2206

- 벽 부수고 이동하기 (https://www.acmicpc.net/problem/2206)
*/
public class Main {
    static int width;
    static int height;
    static int[][] map;
    static BreakType[][] visit;

    public static void main(String[] args) {
        initMap();
        System.out.println(findShortestPath());
    }

    private static void initMap() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());
            map = new int[height][width];
            visit = new BreakType[height][width];


            for (int i = 0; i < height; i++) {
                String inputLine = br.readLine();

                for (int j = 0; j < width; j++) {
                    map[i][j] = inputLine.charAt(j) - '0';
                    visit[i][j] = BreakType.NOT_VISIT;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int findShortestPath() {
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0, 1, BreakType.BREAK_NOT_YET));
        visit[0][0] = BreakType.BREAK_NOT_YET;

        while (!queue.isEmpty()) {
            Point current = queue.poll();

            if (current.y == height - 1 && current.x == width - 1) {
                return current.distance;
            }

            for (FourPoint fourPoint : FourPoint.values()) {
                int nextX = current.x + fourPoint.getX();
                int nextY = current.y + fourPoint.getY();

                if (checkOutOfBound(nextX, nextY)
                        || BreakType.checkContinue(current.breakType, visit[nextY][nextX])) {
                    continue;
                }

                if (map[nextY][nextX] == 0) {
                    visit[nextY][nextX] = current.breakType;
                    queue.add(new Point(nextX, nextY, current.distance + 1, current.breakType));
                } else {
                    if (current.breakType.equals(BreakType.BREAK_NOT_YET)) {
                        visit[nextY][nextX] = BreakType.BREAK;
                        queue.add(new Point(nextX, nextY, current.distance + 1, BreakType.BREAK));
                    }
                }
            }
        }

        return -1;
    }

    private static boolean checkOutOfBound(int nextX, int nextY) {
        return nextX < 0 || nextX >= width || nextY < 0 || nextY >= height;
    }

    enum FourPoint {
        NORTH(0, -1),
        SOUTH(0, 1),
        WEST(-1, 0),
        EAST(1, 0);

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

    enum BreakType {
        NOT_VISIT,
        BREAK_NOT_YET,
        BREAK;

        public static boolean checkContinue(BreakType myType, BreakType mapType) {
            switch (myType) {
                case BREAK_NOT_YET:
                    return mapType.equals(BREAK_NOT_YET);
                case BREAK:
                    return !mapType.equals(NOT_VISIT);
                default:
                    return true;
            }
        }
    }

    static class Point {
        int x;
        int y;
        int distance;
        BreakType breakType;

        public Point(int x, int y, int distance, BreakType breakType) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.breakType = breakType;
        }
    }
}
