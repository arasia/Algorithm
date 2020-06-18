import java.util.Scanner;

/*
Acmicpc 16953

- A → B (https://www.acmicpc.net/problem/16953)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 1;
        while (true) {
            if (a > b) {
                result = -1;
                break;
            }

            if (a == b) {
                break;
            }

            if (b % 2 == 0) {
                b = b / 2;
            } else {
                if (b % 10 == 1) {
                    b /= 10;
                } else {
                    result = -1;
                    break;
                }
            }
            result++;
        }

        System.out.println(result);
    }
}
