package question.a_17173;

import java.util.Scanner;

/*
Acmicpc 17173

- 배수들의 합 (https://www.acmicpc.net/problem/17173)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int result = 0;

        boolean[] list = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            int current = sc.nextInt();
            int num = current;
            while (num <= N) {
                if (!list[num]) {
                    result += num;
                }
                list[num] = true;
                num += current;
            }
        }

        System.out.println(result);
    }
}
