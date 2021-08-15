package Question.No17618;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 17618

- 신기한 수 (https://www.acmicpc.net/problem/17618)
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
                char[] current = Integer.toString(i).toCharArray();

                int mod = 0;
                for (char c : current) {
                    mod += (c - '0');
                }

                if (i % mod == 0) {
                    result++;
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
