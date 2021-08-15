package Question.No14935;

import java.util.Scanner;
import java.util.Vector;

/*
Acmicpc 14935

- FA (https://www.acmicpc.net/problem/14935)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        String s = sc.next();

        while (true) {
            int n = (s.charAt(0) - '0') * s.length();

            if (vector.contains(n)) {
                break;
            } else {
                vector.add(n);
                s = String.valueOf(n);
            }
        }

        System.out.println("FA");
    }
}
