package question.a_1655;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Acmicpc
- 가운데를 말해요 (https://www.acmicpc.net/problem/1655)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Queue<Integer> high = new PriorityQueue<>();
            Queue<Integer> low = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < N; i++) {
                low.add(Integer.parseInt(br.readLine()));

                if (low.size() > (high.size() + 1)) {
                    high.add(low.poll());
                }

                if (i > 1) {
                    int lowResult = low.peek();
                    int highResult = high.peek();

                    if (lowResult > highResult) {
                        low.poll();
                        high.poll();
                        low.add(highResult);
                        high.add(lowResult);
                    }
                }

                bw.write(low.peek() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
