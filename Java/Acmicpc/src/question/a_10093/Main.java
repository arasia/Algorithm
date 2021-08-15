package question.a_10093;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10093

- 숫자 (https://www.acmicpc.net/problem/10093)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Long.parseLong(st.nextToken());
            long B = Long.parseLong(st.nextToken());

            if (A > B) {
                long temp = A;
                A = B;
                B = temp;
            }

            long diff = B - A - 1;

            if (diff < 1) {
                bw.write("0");
            } else {
                bw.write(diff + "\n");

                A++;
                while (A < B) {
                    bw.write(A + " ");
                    A++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
