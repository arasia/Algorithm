package question.a_10103;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10103

- 주사위 게임 (https://www.acmicpc.net/problem/10103)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int resultA = 100, resultB = 100;

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

                if (A > B) {
                    resultB -= A;
                } else if (A < B) {
                    resultA -= B;
                }
            }

            bw.write(resultA + "\n" +  resultB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
