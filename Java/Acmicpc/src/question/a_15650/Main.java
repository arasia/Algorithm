package question.a_15650;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- N과 M (2) (https://www.acmicpc.net/problem/15650)
 */
public class Main {
    public static int N;
    public static int M;
    public static boolean[] check;
    public static StringBuilder sb;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            check = new boolean[N+1];
            sb = new StringBuilder();
            func(1, 0, "");
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void func(int current, int depth, String string) {
        if(depth == M) {
            sb.append(string).append("\n");
        } else {
            for (int i = current; i <= N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    func(i, depth + 1, string + i + " ");
                    check[i] = false;
                }
            }
        }
    }
}
