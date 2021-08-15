package question.a_10570;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/*
Acmicpc 10570

- Favorite Number (https://www.acmicpc.net/problem/10570)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                int V = Integer.parseInt(br.readLine());
                Map<Integer, Integer> map = new HashMap<>();

                while (V-- > 0) {
                    int current = Integer.parseInt(br.readLine());
                    if (map.containsKey(current)) {
                        map.put(current, map.get(current) + 1);
                    } else {
                        map.put(current, 1);
                    }
                }

                int max = 0, num = 0;
                for (Integer key : map.keySet()) {
                    int value = map.get(key);
                    if (max < value) {
                        max = value;
                        num = key;
                    } else if (max == value) {
                        if (num > key) {
                            num = key;
                        }
                    }
                }
                bw.write(num + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
