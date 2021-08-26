package question.a_16918;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 16918

- 봄버맨 (https://www.acmicpc.net/problem/16918)
*/
public class Main {
    static int[][] closes = new int[][]{{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static int[][] board;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            board = new int[r][c];

            for (int i = 0; i < r; i++) {
                String input = br.readLine();
                for (int j = 0; j < c; j++) {
                    if (input.charAt(j) == 'O') {
                        board[i][j] = 3;
                    }
                }
            }

            for (int i = 2; i <= n; i++) {
                fillBoard(r, c, i);
                bomb(r, c, i);
            }

            printBoard(r, c, bw);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void bomb(int r, int c, int time) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == time) {
                    for (int[] close : closes) {
                        try {
                            if (board[i + close[0]][j + close[1]] != time) {
                                board[i + close[0]][j + close[1]] = 0;
                            }
                        } catch (ArrayIndexOutOfBoundsException ignored) {
                        }
                    }
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == time) {
                    board[i][j] = 0;
                }
            }
        }
    }

    private static void fillBoard(int r, int c, int time) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = time + 3;
                }
            }
        }
    }

    private static void printBoard(int r, int c, BufferedWriter bw) throws IOException {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                bw.write(board[i][j] == 0 ? "." : "O");
            }

            bw.write("\n");
        }
    }
}