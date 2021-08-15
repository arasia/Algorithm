package question.a_17206;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 17206

- 준석이의 수학 문제 (https://www.acmicpc.net/problem/17206)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());

                bw.write((3 * sum(current / 3) + 7 * sum(current / 7) - 21 * sum(current / 21)) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int sum(int current) {
        return (current * (current + 1)) / 2;
    }
}
