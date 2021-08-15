package Question.No11724;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 11724

- 연결 요소의 개수 (https://www.acmicpc.net/problem/11724)
*/
public class Main {
    static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    static boolean[] visit;
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            visit = new boolean[N+1];

            while (M-- > 0) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                map.computeIfAbsent(x, k -> new ArrayList<>()).add(y);
                map.computeIfAbsent(y, k -> new ArrayList<>()).add(x);
            }

            int result = 0;
            for (int i = 1; i <= N; i++) {
                if (!visit[i]) {
                    dfs(i);
                    result++;
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void dfs(int index) {
        if ((visit[index])) {
            return;
        }

        visit[index] = true;

        for (Integer integer : Optional.ofNullable(map.get(index)).orElse(new ArrayList<>())) {
            dfs(integer);
        }
    }
}
