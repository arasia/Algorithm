package question.a_14909;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 14909

- 양수 개수 세기 (https://www.acmicpc.net/problem/14909)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int result = 0;
            while (st.hasMoreTokens()) {
                if (Integer.parseInt(st.nextToken()) > 0) {
                    result++;
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
