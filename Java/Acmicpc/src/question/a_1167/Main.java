package question.a_1167;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 1167

- 트리의 지름 (https://www.acmicpc.net/problem/1167)
*/
public class Main {
    static int nodeCount;
    static Node[] nodes;

    static boolean[] visit;
    static int deepNodeIndex;
    static int maxLength;

    public static void main(String[] args) {
        initTree();
        System.out.println(findResult());
    }

    private static void initTree() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            nodeCount = Integer.parseInt(br.readLine());
            nodes = new Node[nodeCount + 1];

            for (int i = 0; i <= nodeCount; i++) {
                nodes[i] = new Node(i);
            }

            for (int i = 0; i < nodeCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());

                while (st.hasMoreTokens()) {
                    int to = Integer.parseInt(st.nextToken());

                    if (to == -1) {
                        break;
                    }

                    int cost = Integer.parseInt(st.nextToken());
                    nodes[from].addLink(new Link(to, cost));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int findResult() {
        initDfs(1);
        dfs(1, 0);

        initDfs(deepNodeIndex);
        dfs(deepNodeIndex, 0);

        return maxLength;
    }

    private static void initDfs(int startNodeIndex) {
        visit = new boolean[nodeCount + 1];
        maxLength = Integer.MIN_VALUE;
        visit[startNodeIndex] = true;
    }

    private static void dfs(int index, int length) {
        if (length > maxLength) {
            maxLength = length;
            deepNodeIndex = index;
        }

        for (Link link : nodes[index].links) {
            if (!visit[link.to]) {
                visit[link.to] = true;
                dfs(link.to, link.cost + length);
            }
        }
    }

    static class Node {
        int index;
        List<Link> links = new ArrayList<>();

        public Node(int index) {
            this.index = index;
        }

        public void addLink(Link link) {
            links.add(link);
        }
    }

    static class Link {
        int to;
        int cost;

        public Link(int to, int cost) {
            this.to = to;
            this.cost = cost;
        }
    }
}
