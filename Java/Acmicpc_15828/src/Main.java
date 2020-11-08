import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Queue;

/*
Acmicpc 15828

- Router (https://www.acmicpc.net/problem/15828)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Queue<String> queue = new ArrayDeque<>();

            while (true) {
                String current = br.readLine();

                if (current.equals("-1")) {
                    break;
                }

                if (current.equals("0")) {
                    queue.poll();
                } else {
                    if (queue.size() >= N) {
                        continue;
                    }
                    queue.add(current);
                }
            }

            if (queue.isEmpty()) {
                bw.write("empty");
            } else {
                for (String s : queue) {
                    bw.write(s + " ");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
