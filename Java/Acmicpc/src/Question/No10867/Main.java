package Question.No10867;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 10867

- 중복 뺴고 정렬하기 (https://www.acmicpc.net/problem/10867)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                int current = Integer.parseInt(st.nextToken());
                if (!list.contains(current)) {
                    list.add(current);
                }
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for (Integer integer : list) {
                sb.append(integer).append(" ");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
