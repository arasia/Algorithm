package question.a_2668;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Acmicpc 2668

- 숫자고르기 (https://www.acmicpc.net/problem/2668)
*/
public class Main {
    static int N;
    static int last;
    static boolean[] visit;
    static int[] path;
    static Queue<Integer> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            N = Integer.parseInt(br.readLine());
            visit = new boolean[N + 1];
            path = new int[N + 1];

            for (int i = 1; i <= N; i++) {
                path[i] = Integer.parseInt(br.readLine());
            }

            for (int i = 1; i <= N; i++) {
                visit[i] = true;
                last = i;
                dfs(i);
                visit[i] = false;
            }

            bw.write(queue.size() + "\n");
            while (!queue.isEmpty()) {
                bw.write(queue.poll() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dfs(int i) {
        if (!visit[path[i]]) {
            visit[path[i]] = true;
            dfs(path[i]);
            visit[path[i]] = false;
        }
        if (path[i] == last) {
            queue.add(last);
        }
    }
}
