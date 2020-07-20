import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1735

- 분수 합 (https://www.acmicpc.net/problem/1735)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int au = Integer.parseInt(st.nextToken()), ad = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int bu = Integer.parseInt(st.nextToken()), bd = Integer.parseInt(st.nextToken());

            int lcm = lcm(ad, bd);
            int u = au * (lcm / ad) + bu * (lcm / bd);
            int gcd = gcd(lcm, u);

            bw.write((u / gcd) + " " + (lcm / gcd));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
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
