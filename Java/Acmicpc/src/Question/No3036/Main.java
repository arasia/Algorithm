package Question.No3036;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 3036

- 링 (https://www.acmicpc.net/problem/3036)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int base = Integer.parseInt(st.nextToken());

            for (int i = 1; i < N; i++) {
                int b = Integer.parseInt(st.nextToken());
                int gcd = gcd(base, b);

                bw.write((base / gcd) + "/" + (b / gcd) + "\n");
            }
        } catch (Exception e
        ) {
            e.printStackTrace();
        }
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
