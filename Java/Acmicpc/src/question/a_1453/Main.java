package question.a_1453;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1453

- 피시방 알바 (https://www.acmicpc.net/problem/1453)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean[] chair = new boolean[101];
            int result = 0;

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());

                if (chair[current]) {
                    result++;
                } else {
                    chair[current] = true;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
