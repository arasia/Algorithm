package question.a_18005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 18005

- Even or Odd? (https://www.acmicpc.net/problem/18005)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            if (n % 2 == 0) {
                if ((n / 2) % 2 == 0) {
                    bw.write("2");
                } else {
                    bw.write("1");
                }
            } else {
                bw.write("0");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
