package question.a_1707;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 1707

- 이분 그래프 (https://www.acmicpc.net/problem/1707)
*/
public class Main {
    static int vertexCount;
    static int edgeCount;
    static Vertex[] vertices;
    static int[] visit;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            int testCase = Integer.parseInt(br.readLine());

            for (int i = 0; i < testCase; i++) {
                bw.write(solve(br) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String solve(BufferedReader br) throws IOException {
        initInput(br);
        return checkBipartiteGrape() ? "YES" : "NO";
    }

    private static void initInput(BufferedReader br) throws IOException {
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        vertexCount = Integer.parseInt(st.nextToken());
        edgeCount = Integer.parseInt(st.nextToken());

        vertices = new Vertex[vertexCount + 1];
        for (int i = 1; i <= vertexCount; i++) {
            vertices[i] = new Vertex(i);
        }

        for (int i = 0; i < edgeCount; i++) {
            st = new StringTokenizer(br.readLine());

            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            vertices[from].addLink(vertices[to]);
            vertices[to].addLink(vertices[from]);
        }
    }

    private static boolean checkBipartiteGrape() {
        visit = new int[vertexCount + 1];
        Queue<Vertex> queue = new LinkedList<>();

        for (int i = 1; i <= vertexCount; i++) {
            if (visit[i] == 0) {
                queue.add(vertices[i]);
                visit[i] = 1;
            }

            while (!queue.isEmpty()) {
                Vertex current = queue.poll();

                for (Vertex link : current.links) {
                    if (visit[link.index] == visit[current.index]) {
                        return false;
                    }

                    if (visit[link.index] != 0) {
                        continue;
                    }

                    queue.add(link);

                    if (visit[current.index] == 1) {
                        visit[link.index] = 2;
                    } else {
                        visit[link.index] = 1;
                    }
                }
            }
        }

        return true;
    }

    private static class Vertex {
        int index;
        List<Vertex> links = new ArrayList<>();

        public Vertex(int index) {
            this.index = index;
        }

        public void addLink(Vertex vertex) {
            this.links.add(vertex);
        }
    }
}
