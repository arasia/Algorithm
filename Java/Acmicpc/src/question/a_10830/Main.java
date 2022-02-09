package question.a_10830;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 10830

- 행렬 제곱 (https://www.acmicpc.net/problem/10830)
*/
public class Main {
    static final int MOD = 1000;

    static int matrixSize;
    static long powerTarget;
    static int[][] originMatrix;
    static int[][] resultMatrix;

    public static void main(String[] args) {
        initInput();
        solve();
        printResult();
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());

            matrixSize = Integer.parseInt(st.nextToken());
            powerTarget = Long.parseLong(st.nextToken());

            originMatrix = new int[matrixSize][matrixSize];
            resultMatrix = new int[matrixSize][matrixSize];

            for (int i = 0; i < matrixSize; i++) {
                st = new StringTokenizer(br.readLine());

                for (int j = 0; j < matrixSize; j++) {
                    originMatrix[i][j] = Integer.parseInt(st.nextToken()) % MOD;
                }

                resultMatrix[i][i] = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void solve() {
        while (powerTarget > 0) {
            if (powerTarget % 2 == 1) {
                resultMatrix = multiply(resultMatrix, originMatrix);
            }

            originMatrix = multiply(originMatrix, originMatrix);
            powerTarget /= 2;
        }
    }

    private static int[][] multiply(int[][] firstMatrix, int[][] secondMatrix) {
        int[][] result = new int[matrixSize][matrixSize];

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                for (int k = 0; k < matrixSize; k++) {
                    result[i][j] = (result[i][j] + firstMatrix[i][k] * secondMatrix[k][j]) % MOD;
                }
            }
        }

        return result;
    }

    private static void printResult() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                sb.append(resultMatrix[i][j])
                        .append(" ");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
