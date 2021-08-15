package Question.No1059;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 수2 (https://www.acmicpc.net/problem/1059)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int L = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());

            while (L-- > 0) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int N = Integer.parseInt(br.readLine());

            Collections.sort(list);

            int before = 0;
            int after = 0;

            for (Integer integer : list) {
                if (integer >= N) {
                    after = integer;
                    break;
                }
                before = integer;
            }
            if (after == N) {
                bw.write("0");
            } else {
                int result = (N-before) * (after - N) -1;
                bw.write(String.valueOf(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
