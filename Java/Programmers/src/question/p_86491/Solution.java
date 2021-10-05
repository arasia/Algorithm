package question.p_86491;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
Programmers 86491

- 최소직사각형 (https://programmers.co.kr/learn/courses/30/lessons/86491)
*/
class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}}));
        System.out.println(new Solution().solution(new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}));
        System.out.println(new Solution().solution(new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}));
    }
    public int solution(int[][] sizes) {
        List<Rectangle> rectangleList = new ArrayList<>();

        for (int[] size : sizes) {
            rectangleList.add(new Rectangle(size[0], size[1]));
        }

        Optional<Integer> widthMax = rectangleList.stream()
                .map(Rectangle::getMax)
                .max(Integer::compareTo);

        Optional<Integer> heightMax = rectangleList.stream()
                .map(Rectangle::getMin)
                .max(Integer::compareTo);

        if (widthMax.isEmpty() || heightMax.isEmpty()) {
            throw new IllegalArgumentException();
        }

        return widthMax.get() * heightMax.get();
    }

    public static class Rectangle {
        private final int max;
        private final int min;

        public Rectangle(int width, int height) {
            this.max = Math.max(width, height);
            this.min = Math.min(width, height);
        }

        public int getMax() {
            return max;
        }

        public int getMin() {
            return min;
        }
    }
}
