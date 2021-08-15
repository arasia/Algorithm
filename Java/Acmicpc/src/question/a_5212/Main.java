package question.a_5212;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 5212

- 지구 온난화 (https://www.acmicpc.net/problem/5212)
*/
public class Main {
    static char[][] arr;
    static char[][] result;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
            arr = new char[R + 2][C + 2];
            result = new char[R + 2][C + 2];
            for (int i = 0; i <= R + 1 ; i++) {
                Arrays.fill(arr[i], '.');
                Arrays.fill(result[i], '.');
            }

            for (int i = 1; i <= R; i++) {
                String input = br.readLine();
                for (int j = 1; j <= C ; j++) {
                    arr[i][j] = input.charAt(j - 1);
                }
            }

            int x1 = Integer.MAX_VALUE, x2 = Integer.MIN_VALUE;
            int y1 = Integer.MAX_VALUE, y2 = Integer.MIN_VALUE;
            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    if ((arr[i][j] == 'X') && !check(i, j)) {
                        result[i][j] = 'X';
                        x1 = Math.min(x1, i);
                        x2 = Math.max(x2, i);
                        y1 = Math.min(y1, j);
                        y2 = Math.max(y2, j);
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = x1; i <= x2; i++) {
                for (int j = y1; j <= y2; j++) {
                    sb.append(result[i][j]);
                }
                sb.append("\n");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean check(int i, int j) {
        int count = 0;
        if(arr[i-1][j] == '.') count++;
        if(arr[i+1][j] == '.') count++;
        if(arr[i][j-1] == '.') count++;
        if(arr[i][j+1] == '.') count++;

        return count > 2;
    }
}
