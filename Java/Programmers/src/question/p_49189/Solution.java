package question.p_49189;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/*
Programmers 49189

- 가장 먼 노드 (https://programmers.co.kr/learn/courses/30/lessons/49189)
*/
public class Solution {
    private final Map<Integer, List<Integer>> linkMap = new HashMap<>();
    private boolean[] visit;
    private int[] depths;

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};

        System.out.println(new Solution().solution(n, edge));
    }

    public int solution(int n, int[][] edge) {
        visit = new boolean[n + 1];
        depths = new int[n + 1];

        for (int[] link : edge) {
            linkMap.computeIfAbsent(link[0], integer -> new ArrayList<>()).add(link[1]);
            linkMap.computeIfAbsent(link[1], integer -> new ArrayList<>()).add(link[0]);
        }

        bfs();

        int maxDepth = -1;
        int result = 0;

        for (int depth : depths) {
            if (depth > maxDepth) {
                maxDepth = depth;
                result = 1;
            } else if (depth == maxDepth) {
                result++;
            }
        }

        return result;
    }

    private void bfs() {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(1);
        visit[1] = true;
        depths[1] = 0;

        while (!queue.isEmpty()) {
            Integer currentNode = queue.poll();
            int currentDepth = depths[currentNode];

            for (Integer nextNode : linkMap.get(currentNode)) {
                if (visit[nextNode]) {
                    continue;
                }

                queue.add(nextNode);
                visit[nextNode] = true;
                depths[nextNode] = currentDepth + 1;
            }
        }
    }
}
