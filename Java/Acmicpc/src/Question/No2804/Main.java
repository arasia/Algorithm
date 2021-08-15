package Question.No2804;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2804

- 크로스 워드 만들기 (https://www.acmicpc.net/problem/2804)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken(), B = st.nextToken();
            int indexA = 0, indexB = 0;
            boolean find = false;

            for (int i = 0; i < A.length(); i++) {
                for (int j = 0; j < B.length(); j++) {
                    if (A.charAt(i) == B.charAt(j)) {
                        indexA = i;
                        indexB = j;
                        find = true;
                        break;
                    }
                }
                if (find) break;
            }

            int bx = 0;
            for (int i = 0; i < B.length(); i++) {
                if (i == indexB) {
                    bw.write(A);
                    bx++;
                } else {
                    for (int j = 0; j < A.length(); j++) {
                        if (j == indexA) {
                            bw.write(String.valueOf(B.charAt(bx++)));
                        } else {
                            bw.write(".");
                        }
                    }
                }
                bw.write("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
