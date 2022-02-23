package question.a_18352;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
Acmicpc 18352

- 특정 거리의 도시 찾기 (https://www.acmicpc.net/problem/18352)
*/
public class Main {
    static final int INF = 30_0000;

    static int nodeCount;
    static int targetCost;
    static int startNode;
    static ArrayList<ArrayList<Integer>> edges;

    public static void main(String[] args) {
        initInput();
        printResult(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());
            nodeCount = Integer.parseInt(st.nextToken());
            int edgeCount = Integer.parseInt(st.nextToken());
            targetCost = Integer.parseInt(st.nextToken());
            startNode = Integer.parseInt(st.nextToken());

            edges = new ArrayList<>();
            for (int i = 0; i <= nodeCount; i++) {
                edges.add(new ArrayList<>());
            }

            for (int i = 0; i < edgeCount; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                edges.get(from).add(to);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> solve() {
        int[] dist = new int[nodeCount + 1];
        boolean[] visit = new boolean[nodeCount + 1];

        Arrays.fill(dist, INF);

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(startNode, 0));
        dist[startNode] = 0;

        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();

            if (!visit[currentEdge.to]) {
                visit[currentEdge.to] = true;

                for (Integer nextNode : edges.get(currentEdge.to)) {
                    if (!visit[nextNode] && dist[nextNode] > dist[currentEdge.to] + 1) {
                        dist[nextNode] = dist[currentEdge.to] + 1;
                        priorityQueue.add(new Edge(nextNode, dist[nextNode]));
                    }
                }
            }
        }

        return findTargetCost(dist, targetCost);
    }

    private static List<Integer> findTargetCost(int[] dist, int targetCost) {
        List<Integer> results = new ArrayList<>();

        for (int i = 1; i <= nodeCount; i++) {
            if (dist[i] == targetCost) {
                results.add(i);
            }
        }

        if (results.isEmpty()) {
            results.add(-1);
        }

        return results;
    }

    private static void printResult(List<Integer> solve) {
        StringBuilder sb = new StringBuilder();

        for (int i : solve) {
            sb.append(i)
                    .append("\n");
        }

        System.out.println(sb);
    }
}

class Edge implements Comparable<Edge> {
    int to;
    int cost;

    public Edge(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return cost - o.cost;
    }
}
