import java.util.Scanner;

/*
Acmicpc 11005

- 진법 변환 2 (https://www.acmicpc.net/problem/11005)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while (n != 0) {
            int current = n % b;

            if (current < 10) {
                result.append((char) (current + '0'));
            } else {
                result.append((char) (current + 'A' - 10));
            }
            n = n / b;
        }
        System.out.println(result.reverse().toString());
    }
}
