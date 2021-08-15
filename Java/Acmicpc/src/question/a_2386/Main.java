package question.a_2386;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2386

- 도비의 영어 공부 (https://www.acmicpc.net/problem/2386)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                char ch = st.nextToken().charAt(0);
                int result = 0;

                if (ch == '#') {
                    break;
                }

                while (st.hasMoreTokens()) {
                    char[] input = st.nextToken().toLowerCase().toCharArray();

                    for (char c : input) {
                        if (ch == c) {
                            result++;
                        }
                    }
                }

                bw.write(ch + " " + result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
