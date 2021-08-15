package Question.No9658;

/*
Acmicpc 9658

- 돌 게임 4 (https://www.acmicpc.net/problem/9658)
*/
public class Main {
    public static void main(String[] args) {
        int input = new java.util.Scanner(System.in).nextInt() % 7;
        System.out.println(((input == 1) || (input == 3) ? "CY" : "SK"));
    }
}
