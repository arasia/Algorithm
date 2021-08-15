package Question.No2875;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2875

- 대회 or 인턴 (https://www.acmicpc.net/problem/2875)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
            int team, sub;

            if (M >= (N * 2)) {
                team = N;
                sub = M - (N * 2);
            } else {
                team = M / 2;
                sub = M % 2 + N - team;
            }

            if (sub < K) {
                K -= sub;

                team -= ((K - 1) / 3) + 1;
            }

            bw.write(Integer.toString(team));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
