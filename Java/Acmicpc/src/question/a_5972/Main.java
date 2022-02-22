package question.a_5972;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
Acmicpc 5972

- 택배 배송 (https://www.acmicpc.net/problem/5972)
*/
public class Main {
    static final int INF = 5000_0000;

    static int nodeCount;
    static ArrayList<ArrayList<Edge>> edges;

    public static void main(String[] args) {
        initInput();
        System.out.println(dijkstra(1, nodeCount));
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());
            nodeCount = Integer.parseInt(st.nextToken());
            int edgeCount = Integer.parseInt(st.nextToken());

            edges = new ArrayList<>();
            for (int i = 0; i <= nodeCount; i++) {
                edges.add(new ArrayList<>());
            }

            for (int i = 0; i < edgeCount; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                edges.get(from).add(new Edge(to, cost));
                edges.get(to).add(new Edge(from, cost));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int dijkstra(int start, int finish) {
        int[] dist = new int[nodeCount + 1];
        boolean[] visit = new boolean[nodeCount + 1];

        Arrays.fill(dist, INF);

        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(new Edge(start, 0));
        dist[start] = 0;

        while (!priorityQueue.isEmpty()) {
            Edge currentEdge = priorityQueue.poll();

            if (!visit[currentEdge.to]) {
                visit[currentEdge.to] = true;

                for (Edge edge : edges.get(currentEdge.to)) {
                    if (!visit[edge.to] && dist[edge.to] > dist[currentEdge.to] + edge.cost) {
                        dist[edge.to] = dist[currentEdge.to] + edge.cost;
                        priorityQueue.add(new Edge(edge.to, dist[edge.to]));
                    }
                }
            }
        }

        return dist[finish];
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
