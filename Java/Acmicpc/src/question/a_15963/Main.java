package question.a_15963;

import java.util.Scanner;

/*
Acmicpc 15963

- CASIO (https://www.acmicpc.net/problem/15963)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();

        if (A == B) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
