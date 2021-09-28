package question.p_42584;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/*
Programmers 42584

- 주식가격 (https://programmers.co.kr/learn/courses/30/lessons/42584)
*/
class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(new int[]{1, 2, 3, 2, 3})));
    }

    public int[] solution(int[] prices) {
        Deque<Stock> stockStack = new ArrayDeque<>();
        int[] answer = new int[prices.length];

        stockStack.push(new Stock(prices[0], 0));

        for (int time = 1; time < prices.length; time++) {
            while (!stockStack.isEmpty() && stockStack.peek().getPrice() > prices[time]) {
                Stock stock = stockStack.pop();
                answer[stock.getTime()] = time - stock.getTime();
            }

            stockStack.push(new Stock(prices[time], time));
        }

        while (!stockStack.isEmpty()) {
            Stock stock = stockStack.pop();
            answer[stock.getTime()] = (prices.length - 1) - stock.getTime();
        }

        return answer;
    }

    private static class Stock {
        private final int price;
        private final int time;

        public Stock(int price, int time) {
            this.price = price;
            this.time = time;
        }

        public int getPrice() {
            return price;
        }

        public int getTime() {
            return time;
        }
    }
}
