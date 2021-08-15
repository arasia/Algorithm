package Question.No1920;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 1920

- 수 찾기 (https://www.acmicpc.net/problem/1920)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int[] inputs = getInputs(n, br);
            int m = Integer.parseInt(br.readLine());
            int[] checks = getInputs(m, br);

            Arrays.sort(inputs);

            for (int check : checks) {
                bw.write(checker(check, inputs) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String checker(int check, int[] checkList) {
        int left = 0;
        int right = checkList.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            int current = checkList[mid];

            if (current == check) {
                return "1";
            } else if (current < check) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return "0";
    }

    private static int[] getInputs(int n, BufferedReader br) throws IOException {
        int[] result = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            result[i] = Integer.parseInt(st.nextToken());
        }

        return result;
    }
}
