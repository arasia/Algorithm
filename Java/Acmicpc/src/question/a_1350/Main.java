package question.a_1350;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1350

- 진짜 공간 (https://www.acmicpc.net/problem/1350)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cluster = Integer.parseInt(br.readLine());
            long result = 0;

            for (int i = 0; i < n; i++) {
                int current = Integer.parseInt(st.nextToken());

                if (current == 0) {
                    continue;
                }

                int size = current / cluster;
                int mod = current % cluster;
                int realSize = size * cluster;
                result += (mod != 0 ? realSize + cluster : realSize);
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
