package question.a_16928;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 16928

- 뱀과 사다리 게임 (https://www.acmicpc.net/problem/16928)
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(solve(getLinks()));
    }

    private static int solve(Map<Integer, Integer> links) {
        int[] depths = new int[101];
        Arrays.fill(depths, Integer.MAX_VALUE);

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(Node.of(1, 0));

        while (!queue.isEmpty()) {
            Node currentNode = queue.poll();

            if (currentNode.getStep() == 100) {
                break;
            }

            int nextDepth = currentNode.getDepth() + 1;

            for (int i = 6; i > 0 ; i--) {
                int nextStep = currentNode.getStep() + i;

                if (nextStep > 100) {
                    continue;
                }

                if (links.containsKey(nextStep)) {
                    nextStep = links.get(nextStep);
                }

                if (depths[nextStep] > nextDepth) {
                    depths[nextStep] = nextDepth;
                    queue.add(Node.of(nextStep, nextDepth));
                }
            }
        }

        return depths[100];
    }

    private static Map<Integer, Integer> getLinks() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> links = new HashMap<>();
        try (br) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int ladderCount = Integer.parseInt(st.nextToken());
            int snakeCount = Integer.parseInt(st.nextToken());
            int totalCount = ladderCount + snakeCount;

            for (int i = 0; i < totalCount; i++) {
                st = new StringTokenizer(br.readLine());
                links.put(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return links;
    }

    private static class Node {
        private final int step;
        private final int depth;

        public Node(int step, int depth) {
            this.step = step;
            this.depth = depth;
        }

        public static Node of(int step, int depth) {
            return new Node(step, depth);
        }

        public int getStep() {
            return step;
        }

        public int getDepth() {
            return depth;
        }
    }
}
