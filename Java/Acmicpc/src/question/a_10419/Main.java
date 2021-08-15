package question.a_10419;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 10419

- 지각 (https://www.acmicpc.net/problem/10419)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                int current = Integer.parseInt(br.readLine());
                int result = 0;

                while (true) {
                    int sum = (int) (result + Math.pow(result, 2));
                    if (current < sum) {
                        result--;
                        break;
                    }
                    result++;
                }

                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
