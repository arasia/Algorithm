package question.a_11725;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 11725

- 트리의 부모 찾기 (https://www.acmicpc.net/problem/11725)
*/
public class Main {
    static int nodeCount;
    static Node[] nodes;

    public static void main(String[] args) {
        initLinks();
        findParent();
        printParent();
    }

    private static void initLinks() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            nodeCount = Integer.parseInt(br.readLine());

            nodes = new Node[nodeCount + 1];
            for (int i = 0; i <= nodeCount; i++) {
                nodes[i] = new Node(i);
            }

            for (int i = 1; i < nodeCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int from = Integer.parseInt(st.nextToken());
                int to = Integer.parseInt(st.nextToken());

                nodes[from].addChild(nodes[to]);
                nodes[to].addChild(nodes[from]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void findParent() {
        boolean[] visit = new boolean[nodeCount + 1];
        Queue<Node> findQueue = new LinkedList<>();

        findQueue.add(nodes[1]);
        visit[1] = true;

        while (!findQueue.isEmpty()) {
            Node current = findQueue.poll();

            for (Node child : current.children) {
                if (!visit[child.value]) {
                    visit[child.value] = true;
                    child.parent = current.value;
                    findQueue.add(child);
                }
            }
        }
    }

    private static void printParent() {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (bw) {
            for (int i = 2; i <= nodeCount; i++) {
                bw.write(nodes[i].parent + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Node {
        int parent;
        int value;
        ArrayList<Node> children;

        public Node(int value) {
            this.parent = 0;
            this.value = value;
            this.children = new ArrayList<>();
        }

        public void addChild(Node child) {
            children.add(child);
        }
    }
}
