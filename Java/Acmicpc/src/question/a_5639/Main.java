package question.a_5639;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 5639

- 이진 검색 트리 (https://www.acmicpc.net/problem/5639)
*/
public class Main {
    static List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        initInput();
        printPostOrder(makeTree());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        try (br) {
            while ((input = br.readLine()) != null && !input.isEmpty()) {
                nums.add(Integer.parseInt(input));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Node makeTree() {
        Node rootNode = new Node(nums.get(0));

        for (int i = 1; i < nums.size(); i++) {
            rootNode.insertChild(nums.get(i));
        }

        return rootNode;
    }

    private static void printPostOrder(Node node) {
        if (node == null) {
            return;
        }

        printPostOrder(node.leftChild);
        printPostOrder(node.rightChild);
        System.out.println(node.value);
    }
}

class Node {
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value) {
        this.value = value;
    }

    public void insertChild(int value) {
        if (value < this.value) {
            if (this.leftChild == null) {
                this.leftChild = new Node(value);
            } else {
                this.leftChild.insertChild(value);
            }
        } else {
            if (this.rightChild == null) {
                this.rightChild = new Node(value);
            } else {
                this.rightChild.insertChild(value);
            }
        }
    }
}
