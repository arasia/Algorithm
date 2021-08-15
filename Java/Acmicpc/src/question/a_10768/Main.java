package question.a_10768;

import java.util.Scanner;

/*
Acmicpc 10768

- 특별한 날 (https://www.acmicpc.net/problem/10768)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), d = sc.nextInt();
        int result;

        if (m < 2) {
            result = 1;
        } else if (m == 2) {
            if (d < 18) {
                result = 1;
            } else if (d == 18) {
                result = 2;
            } else {
                result = 3;
            }
        } else {
            result = 3;
        }

        switch (result) {
            case 1:
                System.out.println("Before");
                break;
            case 2:
                System.out.println("Special");
                break;
            case 3:
                System.out.println("After");
        }
    }
}
