package Question.No3023;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 3023

- 마술사 이민혁 (https://www.acmicpc.net/problem/3023)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());
            char[][] result = new char[R * 2 + 1][C * 2 + 1];

            char[][] base = new char[R + 1][C + 1];
            for (int i = 1; i <= R; i++) {
                if (C >= 0) System.arraycopy(br.readLine().toCharArray(), 0, base[i], 1, C);
            }

            for (int i = 1; i <= R; i++) {
                for (int j = 1; j <= C; j++) {
                    result[i][j] = base[i][j];
                    result[i][C * 2 - j + 1] = base[i][j];
                    result[R * 2 - i + 1][j] = base[i][j];
                    result[R * 2 - i + 1][C * 2 - j + 1] = base[i][j];
                }
            }

            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

            if (result[A][B] == '#') {
                result[A][B] = '.';
            } else {
                result[A][B] = '#';
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= R * 2 ; i++) {
                for (int j = 1; j <= C * 2; j++) {
                    sb.append(result[i][j]);
                }
                sb.append("\n");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
