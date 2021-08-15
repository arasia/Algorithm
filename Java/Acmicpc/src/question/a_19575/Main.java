package question.a_19575;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 19575

- Polynomial (https://www.acmicpc.net/problem/19575)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int mod = 1000000007;

            long result = 0;
            while (N-- > -1) {
                st = new StringTokenizer(br.readLine());
                result *= x;
                result = (result + Long.parseLong(st.nextToken())) % mod ;
            }

            bw.write(Long.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
