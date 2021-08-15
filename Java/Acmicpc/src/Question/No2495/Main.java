package Question.No2495;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 2495

- 연속구간 (https://www.acmicpc.net/problem/2495)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = 3;

            while (N-- > 0) {
                char[] chars = br.readLine().toCharArray();

                int max = 0, n = 0;
                char ch = chars[0];

                for (char c : chars) {
                    if (c == ch) {
                        n++;
                    } else {
                        max = Math.max(max, n);
                        n = 1;
                        ch = c;
                    }
                }

                bw.write(Math.max(max, n) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
