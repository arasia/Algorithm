package Question.No1913;

import java.util.Scanner;

/*
Acmicpc 1913

- 달팽이 (https://www.acmicpc.net/problem/1913)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), find = sc.nextInt();
        int[][] arr = new int[N + 2][N + 2];
        Point[] next = new Point[4];
        next[0] = new Point(-1, 0);
        next[1] = new Point(0, 1);
        next[2] = new Point(1, 0);
        next[3] = new Point(0, -1);


        int x = N / 2 + 1, y = N / 2 + 1;
        int type = 0, max = (int) Math.pow(N, 2);
        int len = 1, count = 0;
        boolean turn = false;
        int rx = 0, ry = 0;

        for (int i = 1; i <= max ; i++) {
            arr[x][y] = i;
            if (i == find) {
                rx = x;
                ry = y;
            }

            x += next[type].x;
            y += next[type].y;
            count++;

            if (len == count) {
                count = 0;

                if (turn) {
                    len++;
                }
                turn = !turn;
                type = (type + 1) % 4;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            sb.append("\n");
        }

        sb.append(rx).append(" ").append(ry);
        System.out.println(sb.toString());
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
