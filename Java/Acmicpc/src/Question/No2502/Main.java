package Question.No2502;

import java.util.Scanner;

/*
Acmicpc 2502

- 떡 먹는 호랑이 (https://www.acmicpc.net/problem/2502)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = sc.nextInt(), K = sc.nextInt();

        int[] arr = new int[D + 1];
        arr[0] = 0;
        arr[1] = arr[2] = 1;
        for (int i = 3; i <= D; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        int a = 1, b;
        int ax = arr[D - 2], bx = arr[D - 1];

        while (true) {
            int temp = K - a * ax;
            if ((temp % bx) == 0) {
                b = temp / bx;
                break;
            }
            a++;
        }

        System.out.println(a + "\n" + b);
    }
}
