package question.a_1715;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

/*
Acmicpc 1715

- 카드 정렬하기 (https://www.acmicpc.net/problem/1715)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Queue<Integer> queue = new PriorityQueue<>();

            for (int i = 0; i < N; i++) {
                queue.add(Integer.parseInt(br.readLine()));
            }

            int result = 0;
            while (queue.size() > 1) {
                int sum = queue.poll() + queue.poll();
                result += sum;
                queue.add(sum);
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
