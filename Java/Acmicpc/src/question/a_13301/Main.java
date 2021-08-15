package question.a_13301;

/*
Acmicpc 13301

- 타일 장식물 (https://www.acmicpc.net/problem/13301)
*/
public class Main {
    public static void main(String[] args) {
        int N = new java.util.Scanner(System.in).nextInt();
        long pre = 0, next = 1;

        while (N-- > 1) {
            long temp = pre + next;
            pre = next;
            next = temp;
        }

        System.out.println(4 * next + 2 * pre);
    }
}
