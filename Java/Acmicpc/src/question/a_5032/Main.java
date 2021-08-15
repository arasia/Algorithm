package question.a_5032;

import java.util.Scanner;

/*
Acmicpc 5032

- 탄산음료 (https://www.acmicpc.net/problem/5032)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt() + sc.nextInt();
        int c = sc.nextInt();
        int result = 0;
        while (sum/c != 0) {
            result += sum / c;
            sum = sum / c + sum % c;
        }

        System.out.println(result);
    }
}
