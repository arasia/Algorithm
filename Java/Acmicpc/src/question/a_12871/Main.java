package question.a_12871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 12871

- 무한 문자열 (https://www.acmicpc.net/problem/12871)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input1 = br.readLine();
            String input2 = br.readLine();
            int length1 = input1.length();
            int length2 = input2.length();

            int gcd = gcd(length1, length2);

            input1 = input1.repeat(length2 / gcd);
            input2 = input2.repeat(length1 / gcd);

            bw.write(input1.equals(input2) ? "1" : "0");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int gcd(int a, int b) {
        while (b > 0) {
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
