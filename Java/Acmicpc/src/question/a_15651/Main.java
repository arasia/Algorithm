package question.a_15651;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- N과 M (3) (https://www.acmicpc.net/problem/15651)
 */
public class Main {
    public static int N;
    public static int M;
    public static StringBuilder sb;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            sb = new StringBuilder();
            func(0, "");
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void func(int depth, String string) {
        if(depth == M) {
            sb.append(string).append("\n");
        } else {
            for (int i = 1; i <= N; i++) {
                func(depth + 1, string + i + " ");
            }
        }
    }
}
