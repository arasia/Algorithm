package question.a_1780;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- 종이의 개수 (https://www.acmicpc.net/problem/1780)
 */
public class Main {
    private static int[][] paper;
    private static int[] result = {0, 0, 0};

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            paper = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N ; j++) {
                    paper[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            paperCounter(0, 0, N);
            bw.write(result[0] + "\n" + result[1] + "\n" + result[2]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void paperCounter(int start_x, int start_y, int width) {
        if (check(start_x, start_y, width)) {
            result[paper[start_x][start_y] + 1]++;
        } else {
            width /= 3;
            paperCounter(start_x, start_y, width);
            paperCounter(start_x, start_y + width, width);
            paperCounter(start_x, start_y + (width * 2), width);

            paperCounter(start_x + width, start_y, width);
            paperCounter(start_x + width, start_y + width, width);
            paperCounter(start_x + width, start_y + (width * 2), width);

            paperCounter(start_x + (width * 2), start_y, width);
            paperCounter(start_x + (width * 2), start_y + width, width);
            paperCounter(start_x + (width * 2), start_y + (width * 2), width);
        }
    }

    private static boolean check(int start_x, int start_y, int width) {
        int firstCell = paper[start_x][start_y];

        for (int i = start_x; i < start_x + width; i++) {
            for (int j = start_y; j < start_y + width; j++) {
                if(firstCell != paper[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
