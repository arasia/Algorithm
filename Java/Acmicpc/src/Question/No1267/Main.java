package Question.No1267;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 1267

- 핸드폰 요금 (https://www.acmicpc.net/problem/1267)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (N-- > 0) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int Y = 0, M = 0;

            for (Integer integer : list) {
                Y += ((integer / 30) + 1) * 10;
                M += ((integer / 60) + 1) * 15;
            }

            if (Y < M) {
                bw.write("Y " + Y);
            } else if (Y == M) {
                bw.write("Y M " + Y);
            } else {
                bw.write("M " + M);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
