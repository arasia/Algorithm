package question.a_10953;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- A+B - 6 (https://www.acmicpc.net/problem/10953)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            while(T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine(), ",");
                bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
