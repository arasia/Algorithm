package question.a_1781;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 1781

- 컵라면 (https://www.acmicpc.net/problem/1781)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Question> list = new ArrayList<>();
            long result = 0;
            int maxTime = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int deadline = Integer.parseInt(st.nextToken());
                int price = Integer.parseInt(st.nextToken());

                if (deadline > maxTime) {
                    maxTime = deadline;
                }

                list.add(new Question(deadline, price));
            }

            Collections.sort(list);

            Queue<Integer> queue = new PriorityQueue<>();

            for (Question question : list) {
                queue.add(question.price);
                if (question.deadline < queue.size()) {
                    queue.poll();
                }
            }

            for (Integer integer : queue) {
                result += integer;
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Question implements Comparable<Question> {
        int deadline;
        int price;

        public Question(int deadline, int price) {
            this.deadline = deadline;
            this.price = price;
        }

        @Override
        public int compareTo(Question question) {
            if(this.deadline > question.deadline) {
                return 1;
            } else if (this.deadline == question.deadline) {
                return Integer.compare(question.price, this.price);
            } else {
                return -1;
            }
        }

        @Override
        public String toString() {
            return "Question{" +
                    "deadline=" + deadline +
                    ", price=" + price +
                    '}';
        }
    }
}
