package Question.No2002;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Acmicpc 2002

- 추월 (https://www.acmicpc.net/problem/2002)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();

            for (int i = 1; i <= N; i++) {
                map.put(br.readLine(), i);
            }

            int result = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 1; i <= N ; i++) {
                list.add(map.get(br.readLine()));
            }

            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (list.get(i) > list.get(j)) {
                        result++;
                        break;
                    }
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
