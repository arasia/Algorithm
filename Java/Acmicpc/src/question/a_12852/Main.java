package question.a_12852;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/*
Acmicpc 12852

- 1로 만들기 2 (https://www.acmicpc.net/problem/12852)
*/
public class Main {
    public static void main(String[] args) {
        int input = initInput();

        printResult(solve(input));
    }

    private static int initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            return Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        throw new IllegalArgumentException();
    }

    private static ShortestPath solve(int input) {
        ShortestPath result = new ShortestPath(0, 0, "");
        boolean[] visit = new boolean[input + 1];

        Queue<ShortestPath> queue = new ArrayDeque<>();
        queue.add(new ShortestPath(input, 0, String.valueOf(input)));
        visit[input] = true;

        while (!queue.isEmpty()) {
            ShortestPath current = queue.poll();

            if (current.value == 1) {
                result = current;
                break;
            }

            for (Method method : Method.values()) {
                if (method.check(current.value)) {
                    int next = method.nextValue(current.value);

                    if (visit[next]) {
                        continue;
                    }

                    String nextPath = current.path + " " + next;

                    queue.add(new ShortestPath(next, current.cost + 1, nextPath));
                    visit[next] = true;
                }
            }
        }

        return result;
    }

    private static void printResult(ShortestPath shortestPath) {
        System.out.println(shortestPath.cost + "\n" + shortestPath.path);
    }

    private enum Method {
        DOUBLE(n -> (n % 3 == 0) && (n / 3 > 0), n -> n / 3),
        SUB(n -> (n % 2 == 0) && (n / 2 > 0), n -> n / 2),
        LEFT(n -> (n - 1 > 0), n -> n - 1);

        private final IntPredicate predicate;
        private final IntFunction<Integer> function;

        Method(IntPredicate predicate, IntFunction<Integer> function) {
            this.predicate = predicate;
            this.function = function;
        }

        public boolean check(int value) {
            return this.predicate.test(value);
        }

        public int nextValue(int value) {
            return this.function.apply(value);
        }
    }

    static class ShortestPath {
        private final int value;
        private final int cost;
        private final String path;

        public ShortestPath(int value, int cost, String path) {
            this.value = value;
            this.cost = cost;
            this.path = path;
        }
    }
}
