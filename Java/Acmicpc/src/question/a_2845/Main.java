package question.a_2845;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2845

- 파티가 끝나고 난 뒤 (https://www.acmicpc.net/problem/2845)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                bw.write((Integer.parseInt(st.nextToken()) - count) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
