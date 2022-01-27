package question.a_14500;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 14500

- 테트로미노 (https://www.acmicpc.net/problem/14500)
*/
public class Main {
    static int[][] board = new int[505][505];
    static int width;
    static int height;
    static int[][][] figures = {
            // ㅡ
            {{0, 0}, {0, 1}, {0, 2}, {0, 3}},
            // ㅣ
            {{0, 0}, {1, 0}, {2, 0}, {3, 0}},
            // ㅁ
            {{0, 0}, {0, 1}, {1, 0}, {1, 1}},
            // ㄴ
            {{0, 0}, {1, 0}, {2, 0}, {2, 1}},
            {{0, 0}, {0, 1}, {0, 2}, {1, 0}},
            {{0, 0}, {0, 1}, {1, 1}, {2, 1}},
            {{0, 2}, {1, 0}, {1, 1}, {1, 2}},
            // ㄴ-r
            {{0, 0}, {0, 1}, {0, 2}, {1, 2}},
            {{0, 0}, {1, 0}, {2, 0}, {0, 1}},
            {{0, 0}, {1, 0}, {1, 1}, {1, 2}},
            {{2, 0}, {0, 1}, {1, 1}, {2, 1}},
            // ㄹ
            {{0, 0}, {0, 1}, {1, 1}, {1, 2}},
            {{0, 1}, {1, 0}, {1, 1}, {2, 0}},
            {{0, 1}, {0, 2}, {1, 0}, {1, 1}},
            {{0, 0}, {1, 0}, {1, 1}, {2, 1}},
            // ㅜ
            {{0, 0}, {0, 1}, {0, 2}, {1, 1}},
            {{0, 1}, {1, 0}, {1, 1}, {2, 1}},
            {{0, 1}, {1, 0}, {1, 1}, {1, 2}},
            {{0, 0}, {1, 0}, {1, 1}, {2, 0}}
    };

    public static void main(String[] args) {
        initBoard();
        System.out.println(findMax());
    }

    private static void initBoard() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            height = Integer.parseInt(st.nextToken());
            width = Integer.parseInt(st.nextToken());


            for (int i = 1; i <= height; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 1; j <= width; j++) {
                    board[i][j] = Integer.parseInt(st.nextToken());
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int findMax() {
        int result = Integer.MIN_VALUE;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                result = Math.max(result, maxFigureValue(i, j));
            }
        }

        return result;
    }

    private static int maxFigureValue(int height, int width) {
        int result = Integer.MIN_VALUE;

        for (int[][] figure : figures) {
            int currentPoint = 0;

            for (int[] point : figure) {
                currentPoint += board[height + point[0]][width + point[1]];
            }

            result = Math.max(result, currentPoint);
        }

        return result;
    }
}
