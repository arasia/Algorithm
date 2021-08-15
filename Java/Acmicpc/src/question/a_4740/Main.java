package question.a_4740;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 4740

- 거울, 오! 거울 (https://www.acmicpc.net/problem/4740)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringBuilder input = new StringBuilder(br.readLine());

                if (input.toString().equals("***")) {
                    break;
                }

                bw.write(input.reverse().toString() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
