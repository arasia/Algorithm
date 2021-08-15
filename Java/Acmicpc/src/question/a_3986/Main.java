package question.a_3986;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/*
Acmicpc 3986

- 좋은 단어 (https://www.acmicpc.net/problem/3986)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            while (N-- > 0) {
                String text = br.readLine();
                Stack<Character> stack = new Stack<>();
                int len = text.length();

                for (int i = 0; i < len; i++) {
                    char ch = text.charAt(i);
                    if (stack.isEmpty() || (!stack.peek().equals(ch))) {
                        stack.add(ch);
                    } else {
                        stack.pop();
                    }
                }

                if (stack.isEmpty()) {
                    result++;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
