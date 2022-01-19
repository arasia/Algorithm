package question.a_1389;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1389

- 케빈 베이컨의 6단계 법칙 (https://www.acmicpc.net/problem/1389)
*/
public class Main {
    private static int userCount;
    private static int linkCount;
    private static int[][] kbMap;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            userCount = Integer.parseInt(st.nextToken());
            linkCount = Integer.parseInt(st.nextToken());

            kbMapInit();

            linkInit(br);

            floydWarshall();

            bw.write(String.valueOf(findMinUser()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int findMinUser() {
        int userIndex = Integer.MAX_VALUE;
        int userValue = Integer.MAX_VALUE;

        for (int i = 1; i <= userCount; i++) {
            int sum = 0;
            for (int j = 1; j <= userCount; j++) {
                sum += kbMap[i][j];
            }

            if (userValue > sum) {
                userIndex = i;
                userValue = sum;
            }
        }

        return userIndex;
    }

    private static void kbMapInit() {
        kbMap = new int[userCount + 1][userCount + 1];

        for (int i = 1; i <= userCount; i++) {
            for (int j = 1; j <= userCount; j++) {
                if (i == j) {
                    kbMap[i][j] = 0;
                } else {
                    kbMap[i][j] = 10000;
                }
            }
        }
    }

    private static void linkInit(BufferedReader br) throws IOException {
        for (int i = 0; i < linkCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());

            kbMap[from][to] = kbMap[to][from] = 1;
        }
    }

    private static void floydWarshall() {
        for (int k = 1; k <= userCount; k++) {
            for (int i = 1; i <= userCount; i++) {
                for (int j = 1; j <= userCount; j++) {
                    kbMap[i][j] = Math.min(kbMap[i][j], kbMap[i][k] + kbMap[k][j]);
                }
            }
        }
    }
}
