package Question.No11328;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 11328

- Strfry (https://www.acmicpc.net/problem/11328)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int[] ch1 = new int[26];
                int[] ch2 = new int[26];

                char[] input1 = st.nextToken().toCharArray(), input2 = st.nextToken().toCharArray();

                for (char c : input1) {
                    ch1[c-'a']++;
                }

                for (char c : input2) {
                    ch2[c-'a']++;
                }

                boolean result = true;
                for (int i = 0; i < 26; i++) {
                    if (ch1[i] != ch2[i]) {
                        result = false;
                        break;
                    }
                }

                if (result) {
                    sb.append("Possible\n");
                } else {
                    sb.append("Impossible\n");
                }
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
