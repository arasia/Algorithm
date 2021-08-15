package question.a_11279;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Acmicpc
- 최대 힙 (https://www.acmicpc.net/problem/11279)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Queue<Integer> q = new PriorityQueue<>((Integer a, Integer b) -> a < b ? 1 : -1);

            while (N-- > 0) {
                int current = Integer.parseInt(br.readLine());
                if(current == 0) {
                    if (q.isEmpty()) {
                        bw.write("0\n");
                    } else {
                        bw.write(q.poll() + "\n");
                    }
                } else {
                    q.add(current);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
