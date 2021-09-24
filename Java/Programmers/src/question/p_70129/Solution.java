package question.p_70129;

/*
Programmers 70129

- 이진변환 반복하기 (https://programmers.co.kr/learn/courses/30/lessons/70129?language=java)
*/
public class Solution {
    public int[] solution(String s) {
        int loop = 0;
        int totalRemove = 0;

        while (!s.equals("1")) {
            int one = 0;
            int zero = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    one++;
                } else {
                    zero++;
                }
            }

            s = Integer.toString(one, 2);
            loop++;
            totalRemove += zero;
        }

        return new int[]{loop, totalRemove};
    }
}
