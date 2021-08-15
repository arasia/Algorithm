package Question.No15656;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 15656

- N과 M (7) (https://www.acmicpc.net/problem/15656)
 */
public class Main {
    public static int N;
    public static int M;
    public static List<Integer> list = new ArrayList<>();
    public static StringBuilder sb;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list);

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
            for (int i = 0; i < N; i++) {
                func(depth + 1, string + list.get(i) + " ");
            }
        }
    }
}
