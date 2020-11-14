import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/*
Acmicpc 10546

- 배부른 마라토너 (https://www.acmicpc.net/problem/10546)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int i = 0; i < N; i++) {
                String name = br.readLine();
                if (map.containsKey(name)) {
                    map.replace(name, map.get(name) + 1);
                } else {
                    map.put(name, 1);
                }
            }

            for (int i = 1; i < N; i++) {
                String name = br.readLine();
                if (map.get(name) > 1) {
                    map.replace(name, map.get(name) - 1);
                } else {
                    map.remove(name);
                }
            }

            String result = "";
            for (String s : map.keySet()) {
                result = s;
            }

            bw.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
