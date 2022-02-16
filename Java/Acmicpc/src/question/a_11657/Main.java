package question.a_11657;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 11657

- 타임머신 (https://www.acmicpc.net/problem/11657)
*/
public class Main {
    static final long INF = 1_0000_0000_0000L;

    static int nodeCount;
    static long[] dist;
    static ArrayList<ArrayList<Edge>> edges;

    public static void main(String[] args) {
        initInput();
        System.out.println(getResult(solve()));
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());
            nodeCount = Integer.parseInt(st.nextToken());
            int edgeCount = Integer.parseInt(st.nextToken());

            dist = new long[nodeCount + 1];
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

                edges.get(from).add(new Edge(from, to, cost));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean solve() {
        dist[1] = 0;
        boolean updated = false;

        for (int i = 1; i < nodeCount; i++) {
            updated = false;

            for (int j = 1; j <= nodeCount; j++) {
                for (Edge edge : edges.get(j)) {
                    if ((dist[edge.from] != INF) && (dist[edge.to] > dist[edge.from] + edge.cost)) {
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
            for (int i = 0; i <= nodeCount; i++) {
                for (Edge edge : edges.get(i)) {
                    if ((dist[edge.from] != INF) && (dist[edge.to] > dist[edge.from] + edge.cost)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static String getResult(boolean solve) {
        if (solve) {
            return "-1";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= nodeCount; i++) {
            if (dist[i] == INF) {
                sb.append("-1");
            } else {
                sb.append(dist[i]);
            }

            sb.append("\n");
        }

        return sb.toString();
    }
}

class Edge {
    final int from;
    final int to;
    final int cost;

    public Edge(int from, int to, int cost) {
        this.from = from;
        this.to = to;
        this.cost = cost;
    }
}
