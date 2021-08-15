package question.a_14627;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 14627

- 파닭 (https://www.acmicpc.net/problem/14627)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            List<Integer> list = new ArrayList<>();
            int left = 1, right = Integer.MIN_VALUE;
            long sum = 0;

            for (int i = 0; i < S; i++) {
                int current = Integer.parseInt(br.readLine());
                list.add(current);
                right = Math.max(right, current);
                sum += current;
            }

            int mid = (left + right) / 2;
            while (left <= right) {
                int count = 0;

                for (Integer integer : list) {
                    count += integer / mid;
                }

                if (count >= C) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }

                mid = (left + right) / 2;
            }

            bw.write(String.valueOf(sum - ((long) mid * C)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
