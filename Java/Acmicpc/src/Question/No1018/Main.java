package Question.No1018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1018

- 체스판 다시 칠하기 (https://www.acmicpc.net/problem/1018)
*/
public class Main {
    private static char[][] BOARD;
    private static char[][] WB;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());

            WB = new char[2][8];
            WB[0] = "WBWBWBWB".toCharArray();
            WB[1] = "BWBWBWBW".toCharArray();

            BOARD = new char[n][m];
            for (int i = 0; i < n; i++) {
                BOARD[i] = br.readLine().toCharArray();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n - 7; i++) {
                for (int j = 0; j < m - 7; j++) {
                    min = Math.min(min, func(i, j));
                }
            }

            bw.write(String.valueOf(min));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static int func(int y, int x) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < WB.length; i++) {
            int cnt = 0;
            for (int j = 0; j < WB[0].length; j++) {
                for (int k = 0; k < WB[0].length; k++) {
                    if (BOARD[y + j][x + k] != WB[(i + j) % 2][k]) {
                        cnt++;
                    }
                }
            }
            min = Math.min(min, cnt);
        }
        return min;
    }
}
