package question.p_86048;

import java.util.HashMap;
import java.util.Map;

/*
Programmers 86048

- 입실 퇴실 (https://programmers.co.kr/learn/courses/30/lessons/86048)
*/
class Solution {
    public int[] solution(int[] enter, int[] leave) {
        int[] answer = new int[leave.length];
        Map<Integer, Integer> people = new HashMap<>();

        int index = 0;


        for (int leavePerson : leave) {
            if (!people.containsKey(leavePerson)) {
                while (index < enter.length) {
                    int countPersonInRoom = 0;
                    for (Map.Entry<Integer, Integer> entry : people.entrySet()) {
                        entry.setValue(entry.getValue() + 1);
                        countPersonInRoom++;
                    }
                    people.put(enter[index], countPersonInRoom);

                    if (enter[index++] == leavePerson) {
                        break;
                    }
                }
            }

            answer[leavePerson - 1] = people.get(leavePerson);
            people.remove(leavePerson);
        }

        return answer;
    }
}