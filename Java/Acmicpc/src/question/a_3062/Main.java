package question.a_3062;

import java.util.Scanner;

/*
Acmicpc 3062

- 수 뒤집기 (https://www.acmicpc.net/problem/3062)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            if (checker(sc.nextInt())) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.println(sb.toString());
    }

    private static boolean checker(int n) {
        String sum = String.valueOf(Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()) + n);
        int len = sum.length();

        for (int i = 0; i < len / 2; i++) {
            if (sum.charAt(i) != sum.charAt(len - i - 1)) {
                return false;
            }
        }

        return true;
    }
}
