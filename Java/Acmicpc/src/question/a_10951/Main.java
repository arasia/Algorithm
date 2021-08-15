package question.a_10951;

import java.util.Scanner;

/*
Acmicpc
- A+B - 4 (https://www.acmicpc.net/problem/10951)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            System.out.println((sc.nextInt() + sc.nextInt()));
        }
    }
}
