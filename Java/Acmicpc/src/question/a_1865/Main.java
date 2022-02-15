package question.a_1865;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 1865

- 웜홀 (https://www.acmicpc.net/problem/1865)
*/
public class Main {
    static final int INF = 10_0000_0000;

    static int nodeCount;
    static int[] dist;
    static ArrayList<ArrayList<Edge>> edges;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            int testCase = Integer.parseInt(br.readLine());

            while (testCase-- > 0) {
                bw.write(solve(br) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String solve(BufferedReader br) throws IOException {
        initInput(br);
        return bellmanFord() ? "YES" : "NO";
    }

    private static void initInput(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        nodeCount = Integer.parseInt(st.nextToken());
        int edgeCount = Integer.parseInt(st.nextToken());
        int warmHoleCount = Integer.parseInt(st.nextToken());

        dist = new int[nodeCount + 1];
        Arrays.fill(dist, INF);

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

        for (int i = 0; i < warmHoleCount; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            edges.get(from).add(new Edge(to, -cost));
        }
    }

    private static boolean bellmanFord() {
        dist[1] = 0;
        boolean updated = false;

        for (int i = 1; i < nodeCount; i++) {
            updated = false;

            for (int j = 1; j <= nodeCount; j++) {
                for (Edge edge : edges.get(j)) {
                    if (dist[edge.to] > dist[j] + edge.cost) {
                        dist[edge.to] = dist[j] + edge.cost;
                        updated = true;
                    }
                }
            }

            if (!updated) {
                break;
            }
        }

        if (updated) {
            for (int i = 1; i <= nodeCount; i++) {
                for (Edge edge : edges.get(i)) {
                    if (dist[edge.to] > dist[i] + edge.cost) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    static class Edge {
        final int to;
        final int cost;

        public Edge(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}
