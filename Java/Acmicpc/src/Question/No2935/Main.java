package Question.No2935;

import java.util.Scanner;

/*
Acmicpc 2935

- 소음 (https://www.acmicpc.net/problem/2935)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String operator = sc.next();
        String B = sc.next();

        if (operator.equals("*")) {
            System.out.println("1" + "0".repeat(A.length() + B.length() - 2));
        } else {
            if (A.length() == B.length()) {
                System.out.println("2" + "0".repeat(A.length()-1));
            } else {
                if (A.length() < B.length()) {
                    String temp = A;
                    A = B;
                    B = temp;
                }
                System.out.println("1" + "0".repeat(A.length() - B.length() - 1) + "1" + "0".repeat(B.length() -1));
            }
        }
    }
}
