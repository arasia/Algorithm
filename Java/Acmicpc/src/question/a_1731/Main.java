package question.a_1731;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 1731

- 추론 (https://www.acmicpc.net/problem/1731)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine()) - 2;
            int first = Integer.parseInt(br.readLine());
            int before = Integer.parseInt(br.readLine());
            int a1 = before - first;
            float b1 = (float) before / first;

            boolean check = true;
            while (N-- > 0) {
                int current = Integer.parseInt(br.readLine());

                int a2 = current - before;
                float b2 = (float) current / before;

                if (a2 == a1) {
                    check = true;
                }

                if (b2 == b1) {
                    check = false;
                }

                a1 = a2;
                b1 = b2;
                before = current;
            }

            if (check) {
                bw.write(String.valueOf(before + a1));
            } else {
                bw.write(String.valueOf(before * (int) b1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
