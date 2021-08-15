package question.a_10818;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- 최소, 최대 (https://www.acmicpc.net/problem/10818)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                max = Math.max(max, current);
                min = Math.min(min, current);
            }

            bw.write(min + " " + max);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
