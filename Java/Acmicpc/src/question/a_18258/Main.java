package question.a_18258;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

/*
Acmicpc
- 큐 2 (https://www.acmicpc.net/problem/18258)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            ArrayDeque<Integer> queue = new ArrayDeque<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch (st.nextToken()) {
                    case "push":
                        queue.add(Integer.parseInt(st.nextToken()));
                        break;
                    case "pop":
                        bw.write((queue.isEmpty() ? "-1" : String.valueOf(queue.poll())) + "\n");
                        break;
                    case "size":
                        bw.write(queue.size() + "\n");
                        break;
                    case "empty":
                        bw.write((queue.isEmpty() ? "1" : "0") + "\n");
                        break;
                    case "front":
                        bw.write((queue.isEmpty() ? "-1" : String.valueOf(queue.getFirst())) + "\n");
                        break;
                    case "back" :
                        bw.write((queue.isEmpty() ? "-1" : String.valueOf(queue.getLast())) + "\n");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
