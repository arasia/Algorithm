package question.a_11576;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 11576

- Base Conversion (https://www.acmicpc.net/problem/11576)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(br.readLine());
            long dec = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = m; i > 0 ; i--) {
                dec += Integer.parseInt(st.nextToken()) * Math.pow(A, i - 1);
            }

            List<Long> result = new ArrayList<>();

            while (dec > 0) {
                result.add(dec % B);
                dec /= B;
            }

            for (int i = result.size() - 1; i >= 0; i--) {
                bw.write(result.get(i) + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
