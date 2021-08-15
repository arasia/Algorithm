package Question.No10820;

import java.util.Scanner;

/*
Acmicpc 10820

- 문자열 분석 (https://www.acmicpc.net/problem/10820)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while (sc.hasNextLine()) {
            char[] input = sc.nextLine().toCharArray();
            int[] result = new int[4];

            for (char c : input) {
                if (c == ' ') {
                    result[3]++;
                } else if (c >= '0' && c <= '9') {
                    result[2]++;
                } else if (c >= 'a' && c <= 'z') {
                    result[0]++;
                } else if (c >= 'A' && c <= 'Z') {
                    result[1]++;
                }
            }

            for (int i : result) {
                sb.append(i).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
        sc.close();
    }
}
