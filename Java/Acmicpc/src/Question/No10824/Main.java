package Question.No10824;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
Acmicpc
- 네 수 (https://www.acmicpc.net/problem/10824)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String AB = st.nextToken() + st.nextToken();
            String CD = st.nextToken() + st.nextToken();
            BigInteger result = new BigInteger(AB).add(new BigInteger(CD));

            bw.write(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
