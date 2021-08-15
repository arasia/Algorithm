package question.a_10984;

import java.util.Scanner;

/*
Acmicpc 17173

- 내 학점을 구해줘 (https://www.acmicpc.net/problem/10984)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int N = sc.nextInt();
            int point = 0;
            float sum = 0;

            for (int i = 0; i < N; i++) {
                int currentPoint = sc.nextInt();
                point += currentPoint;
                sum += sc.nextFloat() * currentPoint;
            }

            sb.append(point).append(" ").append(String.format("%.1f", sum/point)).append("\n");
        }

        System.out.println(sb);
    }
}
