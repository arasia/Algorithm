package Question.No10807;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
Acmicpc 10807

- 개수 세기 (https://www.acmicpc.net/problem/10807)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Map<Integer, Integer> map = new HashMap<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < N; i++) {
                int current = Integer.parseInt(st.nextToken());
                map.put(current, map.computeIfAbsent(current, integer -> 0) + 1);
            }

            bw.write(Integer.toString(map.computeIfAbsent(Integer.parseInt(br.readLine()), integer -> 0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
