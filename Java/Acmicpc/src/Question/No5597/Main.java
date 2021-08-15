package Question.No5597;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 과제 안 내신분..? (https://www.acmicpc.net/problem/5597)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            boolean[] check = new boolean[31];

            for (int i = 0; i < 28; i++) {
                check[Integer.parseInt(br.readLine())] = true;
            }

            for (int i = 1; i < 31; i++) {
                if(!check[i]) {
                    bw.write(i + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
