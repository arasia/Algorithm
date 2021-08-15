package question.a_1977;

import java.util.Scanner;

/*
Acmicpc 1977

- 완전제곱수 (https://www.acmicpc.net/problem/1977)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int start = (int) Math.sqrt(M);
        int finish = (int) Math.sqrt(N);
        int result = 0;
        int min = 101;

        for (int i = start; i <= finish; i++) {
            int current = (int) Math.pow(i, 2);

            if (current >= M && current <= N) {
                result += current;
                if (min > i) {
                    min = i;
                }
            }
        }

        if (result == 0) {
            System.out.println("-1");
        } else {
            System.out.println(result);
            System.out.println((int) Math.pow(min, 2));
        }
    }
}
