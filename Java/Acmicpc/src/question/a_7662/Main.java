package question.a_7662;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.TreeMap;

/*
Acmicpc 7662

- 이중 우선순위 큐 (https://www.acmicpc.net/problem/7662)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int testCount = Integer.parseInt(br.readLine());

            while (testCount-- > 0) {
                bw.write(solve(br) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String solve(BufferedReader br) throws IOException {
        int caseCount = Integer.parseInt(br.readLine());
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < caseCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String method = st.nextToken();
            int value = Integer.parseInt(st.nextToken());

            if (method.equals("I")) {
                treeMap.put(value, treeMap.getOrDefault(value, 0) + 1);
            } else {
                if (treeMap.isEmpty()) {
                    continue;
                }

                int target = findTarget(treeMap, value);
                int count = treeMap.get(target);

                if (count > 1) {
                    treeMap.put(target, count - 1);
                } else {
                    treeMap.remove(target);
                }
            }
        }

        if (treeMap.isEmpty()) {
            return "EMPTY";
        } else {
            return treeMap.lastKey() + " " + treeMap.firstKey();
        }
    }

    private static Integer findTarget(TreeMap<Integer, Integer> treeMap, int value) {
        return value == 1 ? treeMap.lastKey() : treeMap.firstKey();
    }
}
