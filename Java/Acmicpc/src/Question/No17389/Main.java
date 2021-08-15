package Question.No17389;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 보너스 점수 (https://www.acmicpc.net/problem/17389)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            String S = br.readLine();
            int result = 0;
            int bonus = 0;
            for (int i = 0; i < N; i++) {
                char ch = S.charAt(i);

                if (ch == 79) {
                    result += i + 1 + (bonus++);
                } else {
                    bonus = 0;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
