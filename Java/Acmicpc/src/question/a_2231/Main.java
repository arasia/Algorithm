package question.a_2231;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 분해합 (https://www.acmicpc.net/problem/2231)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;

            for (int i = 1; i < N; i++) {
                int current = i;
                int currentNum = i;
                while (current > 0) {
                    currentNum += (current % 10);
                    current /= 10;
                }

                if (currentNum == N) {
                    result = i;
                    break;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
