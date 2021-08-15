package question.a_3474;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 3474

- 교수가 된 현우 (https://www.acmicpc.net/problem/3474)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                int N = Integer.parseInt(br.readLine());
                int two = 0, five = 0;

                for (int i = 2; i <= N; i = i * 2) {
                    two += N / i;
                }

                for (int i = 5; i <= N; i = i * 5) {
                    five += N / i;
                }

                bw.write(Math.min(two, five) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
