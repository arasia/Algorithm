package Question.No10162;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 전자레인지 (https://www.acmicpc.net/problem/10162)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            int[] arr = {300, 60, 10};
            int[] result = new int[3];

            for (int i = 0; i < 3; i++) {
                result[i] = T / arr[i];
                T = T % arr[i];
            }

            if (T == 0) {
                bw.write(result[0] + " " + result[1] + " " + result[2]);
            } else {
                bw.write("-1");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
