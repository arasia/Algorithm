package question.a_11943;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 11943

- 파일 옮기기 (https://www.acmicpc.net/problem/11943)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int C = Integer.parseInt(st.nextToken()), D = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(Math.min(A + D, B + C)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
