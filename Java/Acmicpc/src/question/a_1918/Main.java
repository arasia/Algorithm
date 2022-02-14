package question.a_1918;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/*
Acmicpc 1918
f
- 후위 표기식 (https://www.acmicpc.net/problem/1918)
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(solve(initInput()));
    }

    private static String initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            return br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }

        throw new IllegalArgumentException();
    }

    private static String solve(String input) {
        StringBuilder sb = new StringBuilder();
        Deque<Method> stack = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                sb.append(ch);
                continue;
            }

            Method method = Method.find(ch);

            switch (method) {
                case OPEN:
                    stack.addFirst(method);
                    break;
                case CLOSE:
                    while (!stack.isEmpty() && !stack.peekFirst().equals(Method.OPEN)) {
                        sb.append(stack.pollFirst().method);
                    }
                    stack.pollFirst();
                    break;
                default:
                    if (stack.isEmpty()) {
                        stack.addFirst(method);
                        break;
                    }

                    while (!stack.isEmpty() && (method.order <= stack.peekFirst().order)) {
                        sb.append(stack.pollFirst().method);
                    }
                    stack.addFirst(method);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pollFirst().method);
        }

        return sb.toString();
    }

    enum Method {
        ADD('+', 1),
        SUBTRACT('-', 1),
        MULTIPLY('*', 2),
        DIVIDE('/', 2),
        OPEN('(', 0),
        CLOSE(')', 0);

        private final char method;
        private final int order;

        Method(char method, int order) {
            this.method = method;
            this.order = order;
        }

        public static Method find(char ch) {
            for (Method method : values()) {
                if (ch == method.method) {
                    return method;
                }
            }

            throw new IllegalArgumentException();
        }
    }
}
