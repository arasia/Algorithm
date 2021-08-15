package Question.No14697;

import java.util.Scanner;

/*
Acmicpc 14697

- 방 배정하기 (https://www.acmicpc.net/problem/14697)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(), B = sc.nextInt(), C = sc.nextInt(), N = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i <= N / A; i++) {
            for (int j = 0; j <= N / B ; j++) {
                for (int k = 0; k <= N / C ; k++) {
                    if (N == (A * i + B * j + C * k)) {
                        flag = true;
                        break;
                    }
                }
                if(flag) break;
            }
            if(flag) break;
        }

        if (flag) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
