package Question.No2161;

/*
Acmicpc 2161

- 카드 (https://www.acmicpc.net/problem/2161)
*/
public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        java.util.Queue<Integer> queue = new java.util.ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (true) {
            sb.append(queue.poll()).append(" ");
            if (queue.size() ==  0) {
                break;
            }
            queue.add(queue.poll());
        }

        System.out.println(sb.toString().trim());
    }
}
