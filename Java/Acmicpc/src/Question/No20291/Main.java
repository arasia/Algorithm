package Question.No20291;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
Acmicpc 20291

- 파일 정리 (https://www.acmicpc.net/problem/20291)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int count = Integer.parseInt(br.readLine());
            Set<String> set = new HashSet<>();
            Map<String, Integer> map = new HashMap<>();

            while (count-- > 0) {
                String[] inputs = br.readLine().split("\\.");
                String key = inputs[1];

                set.add(key);
                map.put(key, map.getOrDefault(key, 0) + 1);
            }

            List<String> keys = new ArrayList<>(set);
            keys.sort(Comparator.naturalOrder());

            for (String key : keys) {
                bw.write(key + " " + map.get(key) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
