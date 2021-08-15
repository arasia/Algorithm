package question.a_10886;

import java.util.Scanner;

/*
Acmicpc 10886

- 0 = not cute / 1 = cute (https://www.acmicpc.net/problem/10886)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), result = 0;

        while (N-- > 0) {
            if (sc.nextInt() == 1) {
                result++;
            } else {
                result--;
            }
        }

        if (result > 0) {
            System.out.println("Junhee is cute!");
        } else {
            System.out.println("Junhee is not cute!");
        }
    }
}
