package question.a_10773;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*
Acmicpc
- 제로 (https://www.acmicpc.net/problem/10773)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Stack<Integer> stack = new Stack<>();

            while (N-- > 0) {
                int current = Integer.parseInt(br.readLine());
                if (current == 0) {
                    stack.pop();
                } else {
                    stack.add(current);
                }
            }

            int result = 0;
            for (Integer integer : stack) {
                result += integer;
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
