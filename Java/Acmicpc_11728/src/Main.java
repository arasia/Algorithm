import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 11728

- 배열 합치기 (https://www.acmicpc.net/problem/11728)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            Queue<Integer> queue1 = new PriorityQueue<>();
            Queue<Integer> queue2 = new PriorityQueue<>();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                queue1.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                queue2.add(Integer.parseInt(st.nextToken()));
            }

            while (!queue1.isEmpty() || !queue2.isEmpty()) {
                if (queue1.isEmpty()) {
                    bw.write(queue2.poll() + " ");
                    continue;
                }
                if (queue2.isEmpty()) {
                    bw.write(queue1.poll() + " ");
                    continue;
                }

                if (queue1.peek() < queue2.peek()) {
                    bw.write(queue1.poll() + " ");
                } else {
                    bw.write(queue2.poll() + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
