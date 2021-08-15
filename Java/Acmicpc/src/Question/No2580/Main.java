package Question.No2580;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
Acmicpc 2580

- 스도쿠 (https://www.acmicpc.net/problem/2580)
*/
public class Main {
    static int[][] arr = new int[9][9];
    static ArrayList<Point> list = new ArrayList<>();
    static boolean finish = false;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
                ) {
            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 9; j++) {
                    int n = Integer.parseInt(st.nextToken());
                    arr[i][j] = n;

                    if (n == 0) {
                        list.add(new Point(j, i));
                    }
                }
            }

            sudoku(0);

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    bw.write(arr[i][j] + " ");
                }
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void sudoku(int index) {
        if (index == list.size()) {
            finish = true;
            return;
        }

        int currentX = list.get(index).x;
        int currentY = list.get(index).y;

        for (int i = 1; i <= 9; i++) {
            if (checker(currentX, currentY, i)) {
                arr[currentY][currentX] = i;

                sudoku(index + 1);

                if (finish) {
                    return;
                }

                arr[currentY][currentX] = 0;
            }
        }
    }

    private static boolean checker(int x, int y, int checkNum) {
        for (int i = 0; i < 9; i++) {
            if (arr[y][i] == checkNum) {
                return false;
            }

            if (arr[i][x] == checkNum) {
                return false;
            }
        }

        int arrX = (x / 3) * 3;
        int arrY = (y / 3) * 3;

        for (int i = arrY; i < arrY + 3; i++) {
            for (int j = arrX; j < arrX + 3; j++) {
                if (arr[i][j] == checkNum) {
                    return false;
                }
            }
        }

        return true;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
