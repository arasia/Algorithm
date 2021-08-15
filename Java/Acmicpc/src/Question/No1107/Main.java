package Question.No1107;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
Acmicpc 1107

- 리모컨 (https://www.acmicpc.net/problem/1107)
*/
public class Main {
    static int goal, min = 500000;
    static Set<String> set = IntStream.range(0, 10).mapToObj(String::valueOf).collect(Collectors.toSet());

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            goal = Integer.parseInt(br.readLine());

            if (!br.readLine().equals("0")) {
                Arrays.stream(br.readLine().split(" ")).forEach(set::remove);
            }

            min = Math.min(min, Math.abs(100 - goal));

            if (!set.isEmpty()) {
                func("");
            }

            bw.write(String.valueOf(min));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void func(String num) {
        for (String button : set) {
            String current = num + button;
            min = Math.min(min, Math.abs(goal - Integer.parseInt(current)) + current.length());

            if (current.length() < 6) {
                func(current);
            }
        }
    }
}
