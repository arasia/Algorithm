package Question.No13549;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 13549

- 숨바꼭질 3 (https://www.acmicpc.net/problem/13549)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if (N < K) {
                int min = Integer.MAX_VALUE;
                Queue<Move> queue = new ArrayDeque<>();
                queue.add(new Move(N, 0));

                boolean[] memorization = new boolean[200001];
                Arrays.fill(memorization, false);

                while (!queue.isEmpty()) {
                    Move current = queue.poll();
                    memorization[current.position] = true;

                    if (current.position == K) {
                        min = Math.min(min, current.count);
                    }

                    if (current.position * 2 <= 200000 && !memorization[current.position * 2]) {
                        queue.add(new Move(current.position * 2, current.count));
                    }
                    if (current.position + 1 <= 100000 && !memorization[current.position + 1]) {
                        queue.add(new Move(current.position + 1, current.count + 1));
                    }
                    if (current.position - 1 >= 0 && !memorization[current.position - 1]) {
                        queue.add(new Move(current.position - 1, current.count + 1));
                    }
                }

                bw.write(String.valueOf(min));
            } else {
                bw.write(String.valueOf(N - K));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Move {
        private int position;
        private int count;

        public Move(int position, int count) {
            this.position = position;
            this.count = count;
        }
    }
}
