package Question.No17680;

import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;

/*
Programmers 17680

- 2018 KAKAO BLIND RECRUITMENT [1차] 캐시 (https://programmers.co.kr/learn/courses/30/lessons/17680?language=java)
*/
class Solution {
    public int solution(int cacheSize, String[] cities) {
        var answer = 0;

        Queue<String> queue = new ArrayDeque<>();

        for (String city : cities) {
            city = city.toLowerCase(Locale.ROOT);

            if (queue.contains(city)) {
                queue.remove(city);
                queue.add(city);
                answer++;
            } else {
                if (queue.size() >= cacheSize) {
                    queue.poll();
                }

                if (cacheSize > 0) {
                    queue.add(city);
                }
                answer += 5;
            }
        }

        return answer;
    }
}