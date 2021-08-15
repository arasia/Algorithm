package Question.No17362;

/*
Acmicpc 17362

- 수학은 체육과목 입니다 2 (https://www.acmicpc.net/problem/17362)
*/
public class Main {
    public static void main(String[] args) {
        int n = ((new java.util.Scanner(System.in).nextInt()-1) % 8) + 1;
        System.out.println(n > 5 ? 10 - n : n );
    }
}
