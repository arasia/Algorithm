package question.a_15688;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Acmicpc 15688

- 수 정렬하기 5 (https://www.acmicpc.net/problem/15688)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            while (N-- > 0) {
                list.add(Integer.parseInt(br.readLine()));
            }

            Collections.sort(list);

            StringBuilder sb = new StringBuilder();
            for (Integer integer : list) {
                sb.append(integer).append("\n");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
