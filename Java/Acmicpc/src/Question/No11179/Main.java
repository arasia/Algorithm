package Question.No11179;

/*
Acmicpc 11179

- 2진수 뒤집기 (https://www.acmicpc.net/problem/11179)
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt(String.valueOf(new StringBuilder(Integer.toBinaryString(new java.util.Scanner(System.in).nextInt())).reverse()), 2));
    }
}
