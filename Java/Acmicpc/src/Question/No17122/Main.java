package Question.No17122;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 17122

- 체스 (https://www.acmicpc.net/problem/17122)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a, b;

                String A = st.nextToken();
                a = (A.charAt(0) - 'A' + 1) + (8 * (A.charAt(1) - '1'));
                b = Integer.parseInt(st.nextToken());

                if (isBlack(a) == isBlack(b)) {
                    bw.write("YES\n");
                } else {
                    bw.write("NO\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isBlack(int n) {
        int x = (n - 1) % 8 + 1;
        int y = (n - 1) / 8 + 1;

        if (y % 2 == 1) {
            return x % 2 == 1;
        } else {
            return x % 2 == 0;
        }
    }
}
