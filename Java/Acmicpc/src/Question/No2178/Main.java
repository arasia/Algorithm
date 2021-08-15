package Question.No2178;

import java.io.*;
import java.util.*;

/*
Acmicpc
- 단지번호 붙이기 (https://www.acmicpc.net/problem/2667)
 */
public class Main {

    static int N;
    static int M;
    static int[][] arr;
    static boolean[][] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M+2][N+2];
        visit = new boolean[M+2][N+2];

        for(int i = 0 ; i < N ; i++) {
            String input = br.readLine();
            for(int j = 0 ; j < M ; j++) {
                arr[j+1][i+1] = (int)input.charAt(j) - 48;
                visit[j+1][i+1] = true;
            }
        }

        bw.write(String.valueOf(func()));
        bw.flush();
        bw.close();
        br.close();
    }

    public static int func() {
        int result = Integer.MAX_VALUE;

        Queue<Point> queue = new ArrayDeque<>();
        queue.add(new Point(1, 1, 1));

        while(!queue.isEmpty()) {
            Point point = queue.poll();
            int x = point.getX();
            int y = point.getY();
            int depth = point.getDepth();

            if((arr[x-1][y] == 1) && visit[x-1][y]) {
                if((x-1 == M) && (y == N)) {
                    return depth+1;
                }
                visit[x-1][y] = false;
                queue.add(new Point(x-1, y, depth+1));
            }
            if((arr[x+1][y] == 1) && visit[x+1][y]) {
                if((x+1 == M) && (y == N)) {
                    return depth+1;
                }
                visit[x+1][y] = false;
                queue.add(new Point(x+1, y, depth+1));
            }
            if((arr[x][y-1] == 1) && visit[x][y-1]) {
                if((x == M) && (y-1 == N)) {
                    return depth+1;
                }
                visit[x][y-1] = false;
                queue.add(new Point(x, y-1, depth+1));
            }
            if((arr[x][y+1] == 1) && visit[x][y+1]) {
                if((x == M) && (y+1 == N)) {
                    return depth+1;
                }
                visit[x][y+1] = false;
                queue.add(new Point(x, y+1, depth+1));
            }
        }
        return result;
    }

    static class Point {
        private int x;
        private int y;
        private int depth;

        public Point(int x, int y, int depth) {
            this.x = x;
            this.y = y;
            this.depth = depth;
        }

        public int getDepth() {
            return depth;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
