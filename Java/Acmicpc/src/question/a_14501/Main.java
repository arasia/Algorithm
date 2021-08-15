package question.a_14501;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 14501

- 퇴사 (https://www.acmicpc.net/problem/14501)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[] T = new int[N + 6];
            int[] P = new int[N + 6];
            int[] R = new int[N + 6];

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                T[i] = Integer.parseInt(st.nextToken());
                P[i] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            for (int i = 1; i <= N + 1; i++) {
                R[i] = Math.max(R[i], max);
                R[T[i] + i] = Math.max(R[T[i] + i], P[i] + R[i]);
                max = Math.max(max, R[i]);
            }

            bw.write(String.valueOf(max));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
