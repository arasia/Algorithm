package question.a_1252;

import java.util.Scanner;

/*
Acmicpc 1252

- 이진수 덧셈 (https://www.acmicpc.net/problem/1252)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();

        try {
            a = a.substring(a.indexOf("1"));
        } catch (StringIndexOutOfBoundsException e) {
            a = "0";
        }

        try {
            b = b.substring(b.indexOf("1"));
        } catch (StringIndexOutOfBoundsException e) {
            b = "0";
        }

        int indexA = a.length() - 1, indexB = b.length() - 1, temp = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            int tempA, tempB;
            if (indexA >= 0) {
                tempA = Integer.parseInt(String.valueOf(a.charAt(indexA)));
            } else {
                tempA = 0;
            }

            if (indexB >= 0) {
                tempB = Integer.parseInt(String.valueOf(b.charAt(indexB)));
            } else {
                tempB = 0;
            }

            if (indexA < 0 && indexB < 0 && temp == 0) {
                break;
            }

            temp += tempA + tempB;

            sb.append(temp % 2);

            temp /= 2;
            indexA--;
            indexB--;
        }

        System.out.println(sb.reverse().toString());
    }
}
