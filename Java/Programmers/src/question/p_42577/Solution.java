package question.p_42577;

import java.util.HashSet;

/*
Programmers 42577

- 전화번호 목록 (https://programmers.co.kr/learn/courses/30/lessons/42577?language=java)
*/
class Solution {
    public boolean solution(String[] phoneBook) {
        HashSet<String> hashSet = new HashSet<>();

        for (String phoneNum : phoneBook) {
            for (int i = 1; i < phoneNum.length(); i++) {
                hashSet.add(phoneNum.substring(0, i));
            }
        }

        for (String phoneNum : phoneBook) {
            if (hashSet.contains(phoneNum)) {
                return false;
            }
        }

        return true;
    }
}
