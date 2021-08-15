package Question.No5717;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 5717

- 상근이의 친구들 (https://www.acmicpc.net/problem/5717)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

                if (A == 0 && B == 0) {
                    break;
                }

                bw.write((A + B) +  "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
