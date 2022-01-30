package question.a_9465;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 9465

- 스티커 (https://www.acmicpc.net/problem/9465)
*/
public class Main {
    static int n;
    static int[][] values;

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

    private static int solve(BufferedReader br) throws IOException {
        initLine(br);
        return findMaxValue();
    }

    private static void initLine(BufferedReader br) throws IOException {
        n = Integer.parseInt(br.readLine());
        values = new int[n + 2][2];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 2; i <= n + 1; i++) {
            values[i][0] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 2; i <= n + 1; i++) {
            values[i][1] = Integer.parseInt(st.nextToken());
        }
    }

    private static int findMaxValue() {
        int[][] maxValues = new int[n + 2][2];

        for (int i = 2; i <= n + 1; i++) {
            maxValues[i][0] = Math.max(maxValues[i - 1][1], maxValues[i - 2][1]) + values[i][0];
            maxValues[i][1] = Math.max(maxValues[i - 1][0], maxValues[i - 2][0]) + values[i][1];
        }

        return Math.max(maxValues[n + 1][0], maxValues[n + 1][1]);
    }
}
