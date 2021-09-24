package question.p_82612;

/*
Programmers 82612

- 부족한 금액 계산하기 (https://programmers.co.kr/learn/courses/30/lessons/82612?language=java)
*/
class Solution {
    public long solution(int price, int money, int count) {
        return Math.max((price * ((long) count * (count + 1) / 2)) - money, 0);
    }
}
