package Question.No11441;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 합 구하기 (https://www.acmicpc.net/problem/11441)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            list.add(0);

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= N; i++) {
                list.add(list.get(i - 1) + Integer.parseInt(st.nextToken()));
            }

            int M = Integer.parseInt(br.readLine());

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                int start = Integer.parseInt(st.nextToken());
                int finish = Integer.parseInt(st.nextToken());

                bw.write((list.get(finish) - list.get(start - 1)) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
