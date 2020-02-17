import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

/*
Acmicpc
- 카드2 (https://www.acmicpc.net/problem/2164)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            Queue<Integer> queue = new ArrayDeque<>();

            for (int i = 1; i <= N; i++) {
                queue.add(i);
            }

            boolean flag = true;
            while (queue.size() != 1) {
                if (flag) {
                    queue.poll();
                } else {
                    queue.add(queue.poll());
                }
                flag = !flag;
            }

            bw.write(String.valueOf(queue.poll()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
