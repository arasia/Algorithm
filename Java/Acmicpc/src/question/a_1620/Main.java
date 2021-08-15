package question.a_1620;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/*
Acmicpc 1620

- 나는야 포켓몬 마스터 이다솜 (https://www.acmicpc.net/problem/1620)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            Map<String, Integer> nameMap = new HashMap<>();
            Map<Integer, String> numMap = new HashMap<>();

            for (int i = 1; i <= n; i++) {
                String input = br.readLine();
                nameMap.put(input, i);
                numMap.put(i, input);
            }

            for (int i = 0; i < m; i++) {
                String input = br.readLine();
                if (isNum(input)) {
                    bw.write(numMap.get(Integer.parseInt(input)) + "\n");
                } else {
                    bw.write(nameMap.get(input) + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean isNum(String input) {
        for (char c : input.toCharArray()) {
            if(!Character.isDigit(c))
                return false;
        }
        return true;
    }
}
