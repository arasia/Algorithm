package Question.No11966;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 11966

- 2의 제곱인가? (https://www.acmicpc.net/problem/11966)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            long N = Long.parseLong(br.readLine());
            long check = 1;
            boolean result = false;

            while (check <= N) {
                if (check == N) {
                    result = true;
                    break;
                }

                check *= 2;
            }

            if (result) {
                bw.write("1");
            } else {
                bw.write("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
