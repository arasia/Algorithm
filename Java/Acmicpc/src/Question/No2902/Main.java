package Question.No2902;

/*
Acmicpc 2902

- KMP는 왜 KMP일까? (https://www.acmicpc.net/problem/2902)
*/
public class Main {
    public static void main(String[] args) {
        String[] input = new java.util.Scanner(System.in).next().split("-");
        for (String s : input) {
            System.out.print(s.charAt(0));
        }
    }
}
