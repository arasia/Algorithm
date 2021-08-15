package question.a_16480;

import java.util.Scanner;

/*
Acmicpc 16480

- 외심과 내심은 사랑입니다. (https://www.acmicpc.net/problem/16480)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long R = sc.nextLong();
        long r = sc.nextLong();
        System.out.println(R*(R-2*r));
    }
}
