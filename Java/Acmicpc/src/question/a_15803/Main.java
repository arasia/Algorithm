package question.a_15803;

import java.util.Scanner;

/*
Acmicpc 15803

- PLAYERJINAH'S BOTTLEGROUNDS (https://www.acmicpc.net/problem/15803)
*/
public class Main {
    public static void main(String[] args) {
        if (checker()) {
            System.out.println("WHERE IS MY CHICKEN?");
        } else {
            System.out.println("WINNER WINNER CHICKEN DINNER!");
        }
    }

    private static boolean checker() {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        if (x1 == x2) {
            return x1 == x3;
        }

        if (y1 == y2) {
            return y1 == y3;
        }

        double m = (double) (y2 - y1) / (x2 - x1);
        double b = y1 - (m * x1);

        return ((m * x3) + b) == y3;
    }
}
