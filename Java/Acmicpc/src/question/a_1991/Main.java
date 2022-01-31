package question.a_1991;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 1991

- 트리 순회 (https://www.acmicpc.net/problem/1991)
*/
public class Main {
    public static final char CHILD_IS_NULL = '.';

    static int nodeCount;
    static Node[] nodes;
    static StringBuilder preOrder = new StringBuilder();
    static StringBuilder inOrder = new StringBuilder();
    static StringBuilder postOrder = new StringBuilder();

    public static void main(String[] args) {
        initTree();
        treeTraverse(nodes[0]);
        printResult();
    }

    private static void initTree() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            nodeCount = Integer.parseInt(br.readLine());
            nodes = new Node[nodeCount];

            for (int i = 0; i < nodeCount; i++) {
                nodes[i] = new Node(i);
            }

            for (int i = 0; i < nodeCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char parent = st.nextToken().charAt(0);
                char leftChild = st.nextToken().charAt(0);
                char rightChild = st.nextToken().charAt(0);

                if (leftChild != CHILD_IS_NULL) {
                    nodes[convertCharToNodeIndex(parent)].leftChild = nodes[convertCharToNodeIndex(leftChild)];
                }

                if (rightChild != CHILD_IS_NULL) {
                    nodes[convertCharToNodeIndex(parent)].rightChild = nodes[convertCharToNodeIndex(rightChild)];
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int convertCharToNodeIndex(char leftChild) {
        return leftChild - 'A';
    }

    private static void treeTraverse(Node node) {
        if (node != null) {
            preOrder.append(node.getValue());
            treeTraverse(node.leftChild);
            inOrder.append(node.getValue());
            treeTraverse(node.rightChild);
            postOrder.append(node.getValue());
        }
    }

    private static void printResult() {
        System.out.println(preOrder);
        System.out.println(inOrder);
        System.out.println(postOrder);
    }

    static class Node {
        int value;
        Node leftChild = null;
        Node rightChild = null;

        public Node(int value) {
            this.value = value;
        }

        public char getValue() {
            return (char) (value + 'A');
        }
    }
}
