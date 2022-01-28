package question.a_16236;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 16236

- 아기 상어 (https://www.acmicpc.net/problem/16236)
*/
public class Main {
    static int boardSize;
    static int[][] board;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static int sharkX;
    static int sharkY;
    static int sharkSize = 2;
    static int sharkEatCount = 0;

    public static void main(String[] args) {
        initBoard();
        System.out.println(solve());
    }

    private static void initBoard() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (br) {
            boardSize = Integer.parseInt(br.readLine());
            board = new int[boardSize][boardSize];

            for (int i = 0; i < boardSize; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int j = 0; j < boardSize; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());

                    if (board[i][j] == 9) {
                        sharkX = j;
                        sharkY = i;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        int totalTime = 0;

        while (true) {
            PriorityQueue<Fish> fishes = findFish();

            if (fishes.isEmpty()) {
                break;
            }

            totalTime += eatFish(fishes.poll());
        }

        return totalTime;
    }

    private static PriorityQueue<Fish> findFish() {
        PriorityQueue<Fish> fishes = new PriorityQueue<>();
        Queue<Fish> findQueue = new LinkedList<>();
        boolean[][] visit = new boolean[boardSize][boardSize];

        findQueue.add(new Fish(sharkX, sharkY, 0));
        board[sharkY][sharkX] = 0;
        visit[sharkY][sharkX] = true;

        while (!findQueue.isEmpty()) {
            Fish shark = findQueue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = shark.x + dx[i];
                int nextY = shark.y + dy[i];

                if (isInBoard(nextX, nextY) || visit[nextY][nextX]) {
                    continue;
                }

                int nextArea = board[nextY][nextX];

                if (nextArea >= 1 && nextArea < sharkSize) {
                    fishes.add(new Fish(nextX, nextY, shark.dist + 1));
                    findQueue.add(new Fish(nextX, nextY, shark.dist + 1));
                }

                if (nextArea == 0 || nextArea == sharkSize) {
                    findQueue.add(new Fish(nextX, nextY, shark.dist + 1));
                }

                visit[nextY][nextX] = true;
            }
        }

        return fishes;
    }

    public static boolean isInBoard(int x, int y) {
        return x < 0 || x >= boardSize || y < 0 || y >= boardSize;
    }

    private static int eatFish(Fish targetFish) {
        board[targetFish.y][targetFish.x] = 0;

        sharkX = targetFish.x;
        sharkY = targetFish.y;
        sharkEatCount++;

        if (sharkSize == sharkEatCount) {
            sharkSize++;
            sharkEatCount = 0;
        }

        return targetFish.dist;
    }

    static class Fish implements Comparable<Fish> {
        int x;
        int y;
        int dist;

        public Fish(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }

        @Override
        public int compareTo(Fish o) {
            if (this.dist > o.dist) {
                return 1;
            }

            if (this.dist < o.dist) {
                return -1;
            }

            if (this.y > o.y) {
                return 1;
            }

            if (this.y < o.y) {
                return -1;
            }

            return Integer.compare(this.x, o.x);
        }
    }
}
