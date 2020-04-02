import java.util.Scanner;

/*
Acmicpc 1748

- 수 이어 쓰기 1 (https://www.acmicpc.net/problem/1748)
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int count = 9;
        int length = String.valueOf(N).length();
        int result = 0;
        for (int i = 1; i < length; i++) {
            result += i * count;
            count *= 10;
        }
        result += (N - (int)Math.pow(10, length-1) + 1) * length;
        System.out.println(result);
    }
}
