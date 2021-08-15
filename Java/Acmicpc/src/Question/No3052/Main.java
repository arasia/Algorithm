package Question.No3052;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/*
Acmicpc 3052

- 나머지 (https://www.acmicpc.net/problem/3052)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Set<Integer> list = new HashSet<>();
            int n = 10;

            while (n-- > 0) {
                int current = Integer.parseInt(br.readLine());
                list.add(current % 42);
            }

            bw.write(String.valueOf(list.size()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
