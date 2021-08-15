package question.a_17826;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Acmicpc 17826

- 나의 학점은? (https://www.acmicpc.net/problem/17826)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            list.add(sc.nextInt());
        }
        list.sort(Collections.reverseOrder());

        int index = list.indexOf(sc.nextInt());

        if (index < 5) {
            System.out.println("A+");
        } else if (index < 15) {
            System.out.println("A0");
        } else if (index < 30) {
            System.out.println("B+");
        } else if (index < 35) {
            System.out.println("B0");
        } else if (index < 45) {
            System.out.println("C+");
        } else if (index < 48) {
            System.out.println("C0");
        } else {
            System.out.println("F");
        }
    }
}
