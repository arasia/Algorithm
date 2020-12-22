import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/*
Acmicpc 11652

- 카드 (https://www.acmicpc.net/problem/11652)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Map<Long, Integer> map = new HashMap<>();

            while (N-- > 0) {
                long l = Long.parseLong(br.readLine());

                if (map.containsKey(l)) {
                    map.put(l, map.get(l) + 1);
                } else {
                    map.put(l, 1);
                }
            }

            int max = -1;
            long result = Long.MAX_VALUE;

            for (Map.Entry<Long, Integer> entry : map.entrySet()) {
                if ((entry.getValue() > max) || ((entry.getValue() == max) && (entry.getKey() < result))) {
                    result = entry.getKey();
                    max = entry.getValue();
                }
            }

            bw.write(Long.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
