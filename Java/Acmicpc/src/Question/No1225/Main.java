package Question.No1225;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1225

- 이상한 곱셈 (https://www.acmicpc.net/problem/1225)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken();
            String B = st.nextToken();

            int sumA = 0;
            for (char a : A.toCharArray()) {
                sumA += a - '0';
            }

            int sumB = 0;
            for (char b : B.toCharArray()) {
                sumB += b - '0';
            }

            System.out.println((long) sumA * sumB);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
