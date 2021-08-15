package Question.No12904;

import java.util.Scanner;

/*
Acmicpc 12904

- A와 B (https://www.acmicpc.net/problem/12904)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        StringBuilder sb = new StringBuilder(sc.next());

        while (S.length() != sb.length()) {

            switch (sb.charAt(sb.length() - 1)) {
                case 'A':
                    sb.delete(sb.length() - 1, sb.length());
                    break;
                case 'B':
                    sb.delete(sb.length() - 1, sb.length());
                    sb.reverse();
                    break;
            }
        }

        if (S.equals(sb.toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
