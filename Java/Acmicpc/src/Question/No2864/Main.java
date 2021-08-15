package Question.No2864;

import java.util.Scanner;

/*
Acmicpc 2864

- 5와 6의 차이 (https://www.acmicpc.net/problem/2864)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int min = Integer.parseInt(A.replaceAll("6", "5")) + Integer.parseInt(B.replaceAll("6", "5"));
        int max = Integer.parseInt(A.replaceAll("5", "6")) + Integer.parseInt(B.replaceAll("5", "6"));
        System.out.println(min + " " + max);
    }
}
