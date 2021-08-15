package Question.No10163;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10163

- 색종이 (https://www.acmicpc.net/problem/10163)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[] result = new int[101];
            int[][] paper = new int[102][102];

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x1 = Integer.parseInt(st.nextToken());
                int y1 = Integer.parseInt(st.nextToken());
                int x2 = Integer.parseInt(st.nextToken());
                int y2 = Integer.parseInt(st.nextToken());

                for (int j = x1; j < x1 + x2; j++) {
                    for (int k = y1; k < y1 + y2; k++) {
                        if (paper[j][k] == 0) {
                            result[i]++;
                            paper[j][k] = i;
                        } else {
                            result[paper[j][k]]--;
                            result[i]++;
                            paper[j][k] = i;
                        }
                    }
                }
            }

            for (int i = 1; i <= N; i++) {
                bw.write(result[i] + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
