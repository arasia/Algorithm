package Question.No2252;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 2252

- 줄 세우기 (https://www.acmicpc.net/problem/2252)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] check = new int[N+1];
            Map<Integer, List<Integer>> map = new HashMap<>();

            for (int i = 1; i <= N; i++) {
                map.put(i, new ArrayList<>());
            }

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                map.get(a).add(b);
                check[b]++;
            }

            Queue<Integer> queue = new LinkedList<>();

            for (int i = 1; i <= N; i++) {
                if (check[i] == 0) {
                    queue.add(i);
                }
            }

            while (!queue.isEmpty()) {
                bw.write(queue.peek() + " ");
                Integer current = queue.poll();

                for (int i = 0; i < map.get(current).size(); i++) {
                    int cur = map.get(current).get(i);
                    check[cur]--;
                    if (check[cur] == 0) {
                        queue.add(cur);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
