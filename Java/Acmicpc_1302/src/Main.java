import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/*
Acmicpc 1302

- 베스트셀러 (https://www.acmicpc.net/problem/1302)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Map<String, Integer> map = new HashMap<>();
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                String input = br.readLine();

                if (map.containsKey(input)) {
                    map.replace(input, map.get(input) + 1);
                } else {
                    map.put(input, 1);
                }
            }

            int max = Integer.MIN_VALUE;
            String result = "";
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() < max) {
                    continue;
                }

                if (entry.getValue() == max) {
                    if (entry.getKey().compareTo(result) < 0) {
                        result = entry.getKey();
                    }
                } else {
                    max = entry.getValue();
                    result = entry.getKey();
                }
            }

            bw.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
