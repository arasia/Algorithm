package Question.No1009;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1009

- 분산처리 (https://www.acmicpc.net/problem/1009)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken()) % 4;
                int result = ((int) Math.pow(a, b == 0 ? 4 : b)) % 10;

                bw.write((result == 0 ? 10 : result) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
