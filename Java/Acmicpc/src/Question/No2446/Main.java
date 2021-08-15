package Question.No2446;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 별 찍기 - 9 (https://www.acmicpc.net/problem/2446)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            for (int i = N - 1; i >= 0; i--) {
                bw.write(" ".repeat(N - i - 1) + "*".repeat(i * 2 + 1) + "\n");
            }
            for (int i = 1; i < N; i++) {
                bw.write(" ".repeat(N - i - 1) + "*".repeat(i * 2 + 1) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
