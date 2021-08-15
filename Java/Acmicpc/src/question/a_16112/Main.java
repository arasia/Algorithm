package question.a_16112;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 16112

- 5차 전직 (https://www.acmicpc.net/problem/16112)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

            List<Long> list = new ArrayList<>();
            st = new StringTokenizer(br.readLine());
            while (n-- > 0) {
                list.add(Long.parseLong(st.nextToken()));
            }

            list.sort(Comparator.naturalOrder());

            long result = 0;
            for (int i = 0; i < list.size(); i++) {
                result += list.get(i) * Math.min(i, k);
            }

            bw.write(Long.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
