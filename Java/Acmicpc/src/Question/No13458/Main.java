package Question.No13458;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 13458

- 시험 감독 (https://www.acmicpc.net/problem/13458)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            int B, C;
            long result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            B = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());

            for (Integer integer : list) {
                integer -= B;
                if (integer > 0) {
                    result += (integer - 1) / C + 2;
                } else {
                    result += 1;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
