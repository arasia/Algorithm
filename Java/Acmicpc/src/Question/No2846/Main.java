package Question.No2846;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2846

- 오르막길 (https://www.acmicpc.net/problem/2846)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int left, right, max = -1;
            StringTokenizer st = new StringTokenizer(br.readLine());

            left = Integer.parseInt(st.nextToken());
            right = left;
            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());

                if (current <= right) {
                    max = Math.max(max, right - left);
                    left = current;
                }
                right = current;
            }

            bw.write(String.valueOf(Math.max(max, right - left)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
