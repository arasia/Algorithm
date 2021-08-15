package Question.No2644;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 2644

- 촌수계산 (https://www.acmicpc.net/problem/2644)
 */
public class Main {
    static Map<Integer, List<Integer>> link;
    static boolean[] visit;
    static int[] count;
    static int start;
    static int finish;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            finish = Integer.parseInt(st.nextToken());
            link = new HashMap<>();
            visit = new boolean[n + 1];
            count = new int[n + 1];

            int m = Integer.parseInt(br.readLine());
            for (int i = 1; i <= m; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                link.computeIfAbsent(x, k -> new ArrayList<>());
                link.computeIfAbsent(y, k -> new ArrayList<>());
                link.get(x).add(y);
                link.get(y).add(x);
            }

            bw.write(String.valueOf(bfs(start, n)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int bfs(int start, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        while (!queue.isEmpty()) {
            int current = queue.poll();
            visit[current] = true;

            if (link.containsKey(current)) {
                for (Integer integer : link.get(current)) {
                    if (!visit[integer]) {
                        queue.add(integer);
                        count[integer] = count[current] + 1;
                    }
                }
            }

            if (!queue.isEmpty() && queue.peek() == finish) {
                return count[finish];
            }
        }

        return -1;
    }
}
