import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 15654

- N과 M (9) (https://www.acmicpc.net/problem/15663)
 */
public class Main {
    public static int N;
    public static int M;
    public static Map<Integer, Integer> check = new HashMap<>();
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
                int current = Integer.parseInt(st.nextToken());

                if (check.containsKey(current)) {
                    check.replace(current, check.get(current) + 1);
                } else {
                    check.put(current, 1);
                    list.add(current);
                }
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
        if (depth == M) {
            sb.append(string).append("\n");
        } else {
            for (int current : list) {
                if (check.get(current) > 0) {
                    check.replace(current, check.get(current) - 1);
                    func(depth + 1, string + current + " ");
                    check.replace(current, check.get(current) + 1);
                }
            }
        }
    }
}
