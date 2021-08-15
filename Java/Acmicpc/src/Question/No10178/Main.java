package Question.No10178;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10178

- 할로윈의 사탕 (https://www.acmicpc.net/problem/10178)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken()), mod = Integer.parseInt(st.nextToken());

                bw.write("You get " + (num / mod) + " piece(s) and your dad gets " + (num % mod) + " piece(s).\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
