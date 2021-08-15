package Question.No17253;

import java.util.Scanner;

/*
Acmicpc 17253

- 삼삼한 수 2 (https://www.acmicpc.net/problem/17253)
*/
public class Main {
    public static void main(String[] args) {
        long input = new Scanner(System.in).nextLong();
        long sam = 4052555153018976267L;

        if (input == 0) {
            System.out.println("NO");
            return;
        }

        while (sam > 0) {
            if (input / sam != 0) {
                if (input / sam > 1) {
                    break;
                }
                input -= sam;
            }
            sam /= 3;
        }

        if (input == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
