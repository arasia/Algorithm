package question.a_11653;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 소인수분해 (https://www.acmicpc.net/problem/11653)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int mod = 2;
            while (N >= mod) {
                if (N % mod == 0) {
                    bw.write(mod + "\n");
                    N /= mod;
                } else {
                    mod++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
