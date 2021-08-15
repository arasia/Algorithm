package Question.No4766;

import java.util.Scanner;

/*
Acmicpc 4766

- 일반 화학 실험 (https://www.acmicpc.net/problem/4766)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pre = sc.nextDouble();

        while (true) {
            double current = sc.nextDouble();

            if (current == 999) {
                break;
            }

            System.out.printf("%.2f\n", current - pre);
            pre = current;
        }
    }
}
