import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc
- 숨바꼭질 (https://www.acmicpc.net/problem/1697)
 */
public class Main {
    public static void main(String[] args) {
        try(
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            if(N < K) {
                Queue<Move> queue = new ArrayDeque<>();
                queue.add(new Move(N, 0));

                boolean[] memorization = new boolean[100001];
                Arrays.fill(memorization, false);

                while(!queue.isEmpty()) {
                    Move current = queue.poll();

                    if(current.position == K) {
                        bw.write(String.valueOf(current.count));
                        break;
                    }

                    if(current.position*2 <= 100000 && !memorization[current.position * 2]) {
                        memorization[current.position*2] = true;
                        queue.add(new Move(current.position*2, current.count+1));
                    }
                    if(current.position+1 <= 100000 && !memorization[current.position + 1]) {
                        memorization[current.position+1] = true;
                        queue.add(new Move(current.position+1, current.count+1));
                    }
                    if(current.position > 0 && current.position-1 <= 100000 && !memorization[current.position - 1]) {
                        memorization[current.position-1] = true;
                        queue.add(new Move(current.position-1, current.count+1));
                    }
                }
            } else {
                bw.write(String.valueOf(N-K));
            }
        } catch(Exception e) {
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
