package question.a_6359;

import java.util.Scanner;

/*
Acmicpc 6359

- 만취한 상범 (https://www.acmicpc.net/problem/6359)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (T-- > 0) {
            int n = sc.nextInt();
            boolean[] arr = new boolean[n + 1];

            for (int i = 1; i <= n; i++) {
                for (int j = 1; i * j <= n ; j++) {
                    arr[i * j] = !arr[i * j];
                }
            }

            int result = 0;
            for (int i = 1; i <= n; i++) {
                if (arr[i]) {
                    result++;
                }
            }
            sb.append(result).append("\n");
        }
        System.out.println(sb.toString());
    }
}
