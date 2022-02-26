package question.a_3020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 3020

- 개똥벌레 (https://www.acmicpc.net/problem/3020)
*/
public class Main {
    static int caveLength;
    static int caveHeight;
    static int[] stalagmites;
    static int[] stalactites;
    static int minCrush;
    static int minCrushCount;

    public static void main(String[] args) {
        initInput();
        solve();
        System.out.println(minCrush + " " + minCrushCount);
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            caveLength = Integer.parseInt(st.nextToken());
            caveHeight = Integer.parseInt(st.nextToken());

            stalagmites = new int[caveHeight + 1];
            stalactites = new int[caveHeight + 1];

            for (int i = 0; i < caveLength / 2; i++) {
                stalagmites[Integer.parseInt(br.readLine())]++;
                stalactites[Integer.parseInt(br.readLine())]++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void solve() {
        minCrush = caveLength;
        minCrushCount = 0;
        int[] stalagmiteSums = new int[caveHeight + 1];
        int[] stalactiteSums = new int[caveHeight + 1];

        for (int i = 1; i <= caveHeight; i++) {
            stalagmiteSums[i] = stalagmiteSums[i - 1] + stalagmites[i];
            stalactiteSums[i] = stalactiteSums[i - 1] + stalactites[i];
        }

        for (int height = 1; height <= caveHeight; height++) {
            int crush = stalactiteSums[caveHeight] - stalactiteSums[height - 1];
            crush += stalagmiteSums[caveHeight] - stalagmiteSums[caveHeight - height];

            if (minCrush > crush) {
                minCrush = crush;
                minCrushCount = 1;
            } else if (minCrush == crush) {
                minCrushCount++;
            }
        }
    }
}
