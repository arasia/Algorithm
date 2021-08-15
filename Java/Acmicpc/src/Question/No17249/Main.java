package Question.No17249;

import java.util.Scanner;

/*
Acmicpc 17249

- 태보태보 총난타 (https://www.acmicpc.net/problem/17249)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] st = sc.next().split("\\(\\^0\\^\\)");

        int left = 0;
        int right = 0;

        if (st.length > 0) {
            int leftLen = st[0].length();
            for (int i = 0; i < leftLen; i++) {
                if (st[0].charAt(i) == '@') {
                    left++;
                }
            }
        }

        if (st.length > 1) {
            int rightLen = st[1].length();
            for (int i = 0; i < rightLen; i++) {
                if (st[1].charAt(i) == '@') {
                    right++;
                }
            }
        }

        System.out.println(left + " " + right);
    }
}
