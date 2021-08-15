package Question.No5893;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 5893

- 17배 (https://www.acmicpc.net/problem/5893)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input = br.readLine();
            String shift = new StringBuilder(input + "0000").reverse().toString();
            String one = new StringBuilder(input).reverse().toString();

            StringBuilder result = new StringBuilder();
            int upper = 0;

            for (int i = 0; i < shift.length(); i++) {
                int a = shift.charAt(i) - '0';
                int b;
                if (one.length() > i) {
                    b = one.charAt(i) - '0';
                } else {
                    b = 0;
                }

                int sum = a + b + upper;
                if (sum > 1) {
                    upper = 1;
                    sum -= 2;
                } else {
                    upper = 0;
                }

                result.append(sum);
            }

            if (upper == 1) {
                result.append(upper);
            }

            bw.write(result.reverse().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
