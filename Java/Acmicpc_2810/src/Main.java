import java.util.Scanner;

/*
Acmicpc 2810

- 컵홀더 (https://www.acmicpc.net/problem/2810)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(), result = 0, countL = 0;
        String input = sc.next();

        for (int i = 0; i < N; i++) {
            switch (input.charAt(i)) {
                case 'S':
                    result++;
                    break;
                case 'L':
                    result++;
                    countL++;
                    i++;
                    break;
            }
        }

        if (countL > 0) {
            result++;
        }

        System.out.println(result);
    }
}
