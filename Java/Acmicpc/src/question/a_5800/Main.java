package question.a_5800;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 5800

- 성적 통계 (https://www.acmicpc.net/problem/5800)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int K = Integer.parseInt(br.readLine());

            for (int i = 1; i <= K; i++) {
                bw.write("Class " + i + "\n");

                StringTokenizer st = new StringTokenizer(br.readLine());
                int N = Integer.parseInt(st.nextToken());
                List<Integer> point = new ArrayList<>();

                while (st.hasMoreTokens()) {
                    point.add(Integer.parseInt(st.nextToken()));
                }

                Collections.sort(point);
                int max = point.get(N-1), min = point.get(0), gap = 0;

                int pre = point.get(0);
                for (Integer integer : point) {
                    gap = Math.max(gap, integer - pre);
                    pre = integer;
                }

                bw.write("Max " + max + ", Min " + min + ", Largest gap " + gap + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
