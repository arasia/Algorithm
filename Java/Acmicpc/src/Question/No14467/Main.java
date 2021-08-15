package Question.No14467;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
Acmicpc 14467

- 소가 길을 건너간 이유 1 (https://www.acmicpc.net/problem/14467)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Map<Integer, Integer> cow = new HashMap<>();
            int result = 0;

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int index = Integer.parseInt(st.nextToken());
                int pos = Integer.parseInt(st.nextToken());

                if (cow.containsKey(index)) {
                    if (pos != cow.get(index)) {
                        result++;
                    }
                }
                cow.put(index, pos);
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
