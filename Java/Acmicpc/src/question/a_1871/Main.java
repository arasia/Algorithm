package question.a_1871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1871

- 좋은 자동차 번호판 (https://www.acmicpc.net/problem/1871)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), "-");
                String front = st.nextToken(), second = st.nextToken();
                int f = 0, s = Integer.parseInt(second), temp = 1;

                for (int i = 2; i >= 0; i--) {
                    f += (front.charAt(i) - 'A') * temp;
                    temp *= 26;
                }

                if (Math.abs(f - s) > 100) {
                    bw.write("not nice\n");
                } else {
                    bw.write("nice\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
