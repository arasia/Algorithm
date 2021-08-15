package Question.No12605;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 12605

- 단어순서 뒤집기 (https://www.acmicpc.net/problem/12605)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                List<String> list = new ArrayList<>();

                while (st.hasMoreTokens()) {
                    list.add(st.nextToken());
                }

                Collections.reverse(list);

                StringBuilder sb = new StringBuilder(list.get(0));

                for (int j = 1; j < list.size(); j++) {
                    sb.append(" ").append(list.get(j));
                }

                bw.write("Case #" + i + ": " + sb.toString() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
