package question.a_1753;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/*
Acmicpc 1753

- 최단경로 (https://www.acmicpc.net/problem/1753)
*/
public class Main {
    static int vertexCount;
    static int edgeCount;
    static int startNode;
    static int[] dist;
    static ArrayList<Path>[] edges;

    public static void main(String[] args) {
        initMap();
        dijkstra(startNode);
        printResult();
    }

    private static void initMap() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            vertexCount = Integer.parseInt(st.nextToken());
            edgeCount = Integer.parseInt(st.nextToken());
            startNode = Integer.parseInt(br.readLine());

            dist = new int[vertexCount + 1];
            Arrays.fill(dist, Integer.MAX_VALUE);

            edges = new ArrayList[vertexCount + 1];
            for (int i = 1; i <= vertexCount; i++) {
                edges[i] = new ArrayList<>();
            }

            for (int i = 0; i < edgeCount; i++) {
                st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                edges[from].add(new Path(to, cost));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void dijkstra(int startNode) {
        PriorityQueue<Path> priorityQueue = new PriorityQueue<>();
        dist[startNode] = 0;
        priorityQueue.add(new Path(startNode, 0));

        while (!priorityQueue.isEmpty()) {
            Path current = priorityQueue.poll();

            if (current.cost > dist[current.to]) {
                continue;
            }

            for (Path next : edges[current.to]) {
                if (dist[next.to] > current.cost + next.cost) {
                    dist[next.to] = current.cost + next.cost;
                    priorityQueue.add(new Path(next.to, dist[next.to]));
                }
            }
        }
    }

    private static void printResult() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= vertexCount; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF\n");
            } else {
                sb.append(dist[i])
                        .append("\n");
            }
        }

        System.out.println(sb);
    }

    static class Path implements Comparable<Path> {
        int to;
        int cost;

        public Path(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }

        @Override
        public int compareTo(Path o) {
            return this.cost - o.cost;
        }
    }
}
