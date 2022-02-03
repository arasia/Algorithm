package question.a_11404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 11404

- 플로이드 (https://www.acmicpc.net/problem/11404)
*/
public class Main {
    static final int MAX_VALUE = 2_0000_0000;

    static int nodeCount;
    static int[][] map;

    public static void main(String[] args) {
        initMap();
        floydWarshall();
        printMap();
    }

    private static void initMap() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            nodeCount = Integer.parseInt(br.readLine());
            int edgeCount = Integer.parseInt(br.readLine());

            map = new int[nodeCount + 1][nodeCount + 1];

            for (int i = 1; i <= nodeCount; i++) {
                for (int j = 1; j <= nodeCount; j++) {
                    if (i != j) {
                        map[i][j] = MAX_VALUE;
                    }
                }
            }

            for (int i = 0; i < edgeCount; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int to = Integer.parseInt(st.nextToken());
                int from = Integer.parseInt(st.nextToken());
                int cost = Integer.parseInt(st.nextToken());

                map[to][from] = Math.min(cost, map[to][from]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void floydWarshall() {
        for (int k = 1; k <= nodeCount; k++) {
            for (int i = 1; i <= nodeCount; i++) {
                for (int j = 1; j <= nodeCount; j++) {
                    map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
                }
            }
        }
    }

    private static void printMap() {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= nodeCount; i++) {
            for (int j = 1; j <= nodeCount; j++) {
                if (map[i][j] >= MAX_VALUE) {
                    sb.append("0");
                } else {
                    sb.append(map[i][j]);
                }

                sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
