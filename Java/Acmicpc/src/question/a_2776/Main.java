package question.a_2776;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/*
Acmicpc 2776

- 암기왕 (https://www.acmicpc.net/problem/2776)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            while (T-- > 0) {
                Set<Integer> set = new HashSet<>();

                int N = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    set.add(Integer.parseInt(st.nextToken()));
                }

                int M = Integer.parseInt(br.readLine());
                st = new StringTokenizer(br.readLine());
                while (st.hasMoreTokens()) {
                    if (set.contains(Integer.parseInt(st.nextToken()))) {
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                }
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
