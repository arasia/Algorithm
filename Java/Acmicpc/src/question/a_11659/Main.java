package question.a_11659;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 11659

- 구간 합 구하기 4 (https://www.acmicpc.net/problem/11659)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            int[] sumArray = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N ; i++) {
                sumArray[i] = sumArray[i - 1] + Integer.parseInt(st.nextToken());
            }

            while (M-- > 0) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken()), last = Integer.parseInt(st.nextToken());
                bw.write((sumArray[last] - sumArray[start - 1]) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
