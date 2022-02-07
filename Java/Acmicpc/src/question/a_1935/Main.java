package question.a_1935;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.BinaryOperator;

/*
Acmicpc 1935

- 후위 표기식2 (https://www.acmicpc.net/problem/1935)
*/
public class Main {
    static String input;
    static Double[] values;

    public static void main(String[] args) {
        initInput();
        System.out.printf("%.2f", solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            int valueCount = Integer.parseInt(br.readLine());
            input = br.readLine();
            values = new Double[valueCount];

            for (int i = 0; i < valueCount; i++) {
                values[i] = Double.parseDouble(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double solve() {
        Deque<Double> deque = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                deque.add(getValue(ch));
                continue;
            }

            deque.add(PostfixMethod.applyValue(ch, deque.pollLast(), deque.pollLast()));
        }

        return deque.pop();
    }

    private static double getValue(char ch) {
        return values[ch - 'A'];
    }

    private enum PostfixMethod {
        ADD('+', (d1, d2) -> d2 + d1),
        SUBTRACT('-', (d1, d2) -> d2 - d1),
        MULTIPLY('*', (d1, d2) -> d2 * d1),
        DIVIDE('/', (d1, d2) -> d2 / d1);

        private final char method;
        private final BinaryOperator<Double> function;

        PostfixMethod(char method, BinaryOperator<Double> function) {
            this.method = method;
            this.function = function;
        }

        public static Double applyValue(char method, Double firstValue, Double secondValue) {
            for (PostfixMethod value : values()) {
                if (value.method == method) {
                    return value.function.apply(firstValue, secondValue);
                }
            }
            throw new IllegalArgumentException();
        }
    }
}
