package Question.No1722;

import java.util.Scanner;

/*
Acmicpc 1722

- 순열의 순서 (https://www.acmicpc.net/problem/1722)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        boolean[] check = new boolean[N + 1];
        long[] fact = new long[N + 1];
        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = i * fact[i - 1];
        }

        int M = sc.nextInt();
        if (M == 1) {
            long index = sc.nextLong();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                for (int j = 1; j <= N; j++) {
                    if (check[j]) {
                        continue;
                    }
                    if (fact[N - i - 1] < index) {
                        index -= fact[N - i - 1];
                    } else {
                        arr[i] = j;
                        check[j] = true;
                        break;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            long result = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < arr[i]; j++) {
                    if (!check[j]) {
                        result += fact[N - i - 1];
                    }
                }
                check[arr[i]] = true;
            }
            System.out.println(result + 1);
        }

    }
}
