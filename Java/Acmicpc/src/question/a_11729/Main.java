package question.a_11729;

import java.io.*;

/*
Acmicpc 11729

- 하노이 탑 이동순서 (https://www.acmicpc.net/problem/11729)
*/
public class Main {
    static StringBuilder sb = new StringBuilder();
    static int count = 0;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            hanoi(Integer.parseInt(br.readLine()), 1, 2, 3);

            bw.write(count + "\n");
            bw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void hanoi(int height, int from, int stopover, int to) {
        if (height == 1) {
            printPath(from, to);
            return;
        }

        hanoi(height - 1, from, to, stopover);
        printPath(from, to);
        hanoi(height - 1, stopover, from, to);
    }

    private static void printPath(int from, int to) {
        sb.append(from).append(" ").append(to).append("\n");
        count++;
    }
}
