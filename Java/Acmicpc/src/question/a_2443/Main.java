package question.a_2443;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 별 찍기 - 6 (https://www.acmicpc.net/problem/2443)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            for (int i = (N - 1); i >= 0; i--) {
                bw.write(" ".repeat(N - i - 1) + "*".repeat((i * 2) + 1) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
