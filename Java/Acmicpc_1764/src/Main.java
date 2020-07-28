import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 1764

- 듣보잡 (https://www.acmicpc.net/problem/1764)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            Set<String> set = new HashSet<>();
            Set<String> resultSet = new HashSet<>();

            for (int i = 0; i < N; i++) {
                set.add(br.readLine());
            }

            for (int i = 0; i < M; i++) {
                String temp = br.readLine();
                if (set.contains(temp)) {
                    resultSet.add(temp);
                }
            }

            List<String> result = new ArrayList<>(resultSet);
            Collections.sort(result);
            bw.write(result.size() + "\n");
            for (String s : result) {
                bw.write(s + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
