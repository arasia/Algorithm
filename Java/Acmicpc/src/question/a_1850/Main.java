package question.a_1850;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- 최대공약수 (https://www.acmicpc.net/problem/1850)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            long result = GCD(A, B);

            bw.write("1".repeat((int) result));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static long GCD(long a, long b) {
        if (a % b == 0) {
            return b;
        }

        return GCD(b, a % b);
    }
}
