package question.p_42583;

import java.util.ArrayDeque;
import java.util.Queue;

/*
Programmers 42583

- 다리를 지나는 트럭 (https://programmers.co.kr/learn/courses/30/lessons/42583?language=java)
*/
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(new Solution().solution(100, 100, new int[]{10}));
        System.out.println(new Solution().solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

    public int solution(int bridgeLength, int weight, int[] truckWeights) {
        int totalWeight = 0;
        int time = 0;
        Queue<MovingTruck> bridge = new ArrayDeque<>();
        Queue<Integer> waitingTruck = new ArrayDeque<>();

        for (int truckWeight : truckWeights) {
            waitingTruck.add(truckWeight);
        }

        while (!bridge.isEmpty() || !waitingTruck.isEmpty()) {
            if (!bridge.isEmpty() && bridge.peek().startTime + bridgeLength == time) {
                totalWeight -= bridge.poll().weight;
            }

            if (!waitingTruck.isEmpty() && waitingTruck.peek() + totalWeight <= weight) {
                Integer startingTruck = waitingTruck.poll();
                bridge.add(new MovingTruck(startingTruck, time));
                totalWeight += startingTruck;
            }

            time++;
        }


        return time;
    }

    private static class MovingTruck {
        int weight;
        int startTime;

        public MovingTruck(int weight, int startTime) {
            this.weight = weight;
            this.startTime = startTime;
        }
    }
}
