package question.a_2563;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2563

- 색종이 (https://www.acmicpc.net/problem/2563)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[][] paper = new int[101][101];

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        paper[y + i][x + j]++;
                    }
                }
            }

            int result = 0;
            for (int i = 1; i <= 100; i++) {
                for (int j = 0; j <= 100; j++) {
                    if (paper[i][j] != 0) {
                        result++;
                    }
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
