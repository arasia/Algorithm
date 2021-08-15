package question.a_17388;

import java.util.Scanner;

/*
Acmicpc 17388

- 와글와글 숭고한 (https://www.acmicpc.net/problem/17388)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = sc.nextInt();
        int h = sc.nextInt();

        if ((s + k + h) > 99) {
            System.out.println("OK");
        } else {
            if ((s < k) && (s < h)) {
                System.out.println("Soongsil");
            } else if ((k < s) && (k < h)) {
                System.out.println("Korea");
            } else {
                System.out.println("Hanyang");
            }
        }
    }
}
