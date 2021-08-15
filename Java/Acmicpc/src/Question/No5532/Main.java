package Question.No5532;

import java.util.Scanner;

/*
Acmicpc 5532

- 방학 숙제 (https://www.acmicpc.net/problem/5532)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt(), B = sc.nextInt();
        int C = sc.nextInt(), D = sc.nextInt();

        int m = (A % C) == 0 ? A / C : A / C + 1;
        int k = (B % D) == 0 ? B / D : B /D + 1;

        System.out.println(L - Math.max(m, k));
    }
}
