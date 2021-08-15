package Question.No18406;

/*
Acmicpc 18406

- 럭키 스트레이트 (https://www.acmicpc.net/problem/18406)
*/
public class Main {
    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).next();

        int size = input.length();

        int left = 0, right = 0;

        for (int i = 0; i < size / 2; i++) {
            left += input.charAt(i);
        }

        for (int i = size / 2; i < size; i++) {
            right += input.charAt(i);
        }

        if (left == right) {
            System.out.println("LUCKY");
        } else {
            System.out.println("READY");
        }
    }
}
