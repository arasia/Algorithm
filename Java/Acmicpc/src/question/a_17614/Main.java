package question.a_17614;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 17614

- 369 (https://www.acmicpc.net/problem/17614)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;

            for (int i = 1; i <= N; i++) {
                int current = i;
                while (current > 0) {
                    int mod = current % 10;
                    if (mod == 3 || mod == 6 || mod == 9) {
                        result++;
                    }
                    current /= 10;
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
