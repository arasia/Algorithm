package question.a_9019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.function.IntFunction;

/*
Acmicpc 9019
f
- DSLR (https://www.acmicpc.net/problem/9019)
*/
public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            int testCount = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (testCount-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                sb.append(solve(from, to))
                        .append("\n");
            }

            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String solve(int from, int to) {
        int[] stepLengths = new int[10000];
        Arrays.fill(stepLengths, Integer.MAX_VALUE);

        Queue<Status> queue = new ArrayDeque<>();
        queue.add(Status.of(from, ""));
        stepLengths[from] = 0;

        while (!queue.isEmpty()) {
            Status currentStatus = queue.poll();

            for (Method method : Method.values()) {
                int nextValue = method.nextValue(currentStatus.getValue());
                String nextStep = currentStatus.getStep() + method.getStep();

                if (nextValue == to) {
                    return nextStep;
                }

                if (stepLengths[nextValue] > nextStep.length()) {
                    stepLengths[nextValue] = nextStep.length();
                    queue.add(Status.of(nextValue, nextStep));
                }
            }
        }

        return null;
    }

    private enum Method {
        DOUBLE("D", n -> (n * 2) % 10000),
        SUB("S", n -> {
            if (n == 0) {
                return 9999;
            }
            return n - 1;
        }),
        LEFT("L", n -> {
            if (n == 0) {
                return 0;
            }
            return ((n * 10) + (n / 1000)) % 10000;
        }),
        RIGHT("R", n -> {
            if (n == 0) {
                return 0;
            }
            return (n / 10) + ((n % 10) * 1000);
        });

        private final String step;
        private final IntFunction<Integer> function;

        Method(String step, IntFunction<Integer> function) {
            this.step = step;
            this.function = function;
        }

        public String getStep() {
            return step;
        }

        public int nextValue(int value) {
            return this.function.apply(value);
        }
    }


    private static class Status {
        private final int value;
        private final String step;

        private Status(int value, String step) {
            this.value = value;
            this.step = step;
        }

        public static Status of(int value, String step) {
            return new Status(value, step);
        }

        public int getValue() {
            return value;
        }

        public String getStep() {
            return step;
        }

        public int getStepLength() {
            return step.length();
        }
    }
}
