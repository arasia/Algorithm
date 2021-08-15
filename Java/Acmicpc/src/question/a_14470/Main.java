package question.a_14470;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 14470

- 전자레인지 (https://www.acmicpc.net/problem/14470)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int A = Integer.parseInt(br.readLine()), B = Integer.parseInt(br.readLine());
            int C = Integer.parseInt(br.readLine()), D = Integer.parseInt(br.readLine());
            int E = Integer.parseInt(br.readLine()), result;

            if (A < 0) {
                result = (C * A * -1) + D + (B * E);
            } else {
                result = (B - A) * E;
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
