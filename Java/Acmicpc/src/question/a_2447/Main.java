package question.a_2447;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
Acmicpc 2447

- 별 찍기 - 10 (https://www.acmicpc.net/problem/2447)
*/
public class Main {
    static char[][] arr;
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        arr = new char[N][N];

        drawStar(0, 0, N);

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    bw.write(arr[i][j]);
                }
                bw.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void drawStar(int x, int y, int len) {
        if (len == 1) {
            arr[y][x] = '*';
            return;
        }

        int part = len / 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    drawSpace(x + part * i, y + part * j, part);
                } else {
                    drawStar(x + part * i, y + part * j, part);
                }
            }
        }
    }

    private static void drawSpace(int x, int y, int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[y + i][x + j] = ' ';
            }
        }
    }
}
