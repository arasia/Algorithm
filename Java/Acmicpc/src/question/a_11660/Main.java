package question.a_11660;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 11660

- 구간 합 구하기 5 (https://www.acmicpc.net/problem/11660)
*/
public class Main {
    static int width;
    static int questionCount;
    static int[][] sums;

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try (br; bw) {
            inputValues(br);
            bw.write(findResult(br));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String findResult(BufferedReader br) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < questionCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int finishX = Integer.parseInt(st.nextToken());
            int finishY = Integer.parseInt(st.nextToken());

            sb.append(sums[finishX][finishY] - sums[finishX][startY - 1] - sums[startX - 1][finishY] + sums[startX - 1][startY - 1])
                    .append("\n");
        }

        return sb.toString();
    }

    private static void inputValues(BufferedReader br) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        width = Integer.parseInt(st.nextToken());
        questionCount = Integer.parseInt(st.nextToken());
        sums = new int[width + 1][width + 1];

        for (int i = 1; i <= width; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 1; j <= width; j++) {
                sums[i][j] = sums[i - 1][j] + sums[i][j - 1] - sums[i - 1][j - 1] + Integer.parseInt(st.nextToken());
            }
        }
    }
}
