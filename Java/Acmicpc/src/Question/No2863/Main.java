package Question.No2863;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 2863

- 이게 분수? (https://www.acmicpc.net/problem/2863)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Double> list = new ArrayList<>();
            list.add(Double.parseDouble(st.nextToken()));
            list.add(Double.parseDouble(st.nextToken()));
            st = new StringTokenizer(br.readLine());
            double C = Double.parseDouble(st.nextToken());
            double D = Double.parseDouble(st.nextToken());
            list.add(D);
            list.add(C);

            List<Double> sums = new ArrayList<>();

            for (int i = 4; i > 0; i--) {
                sums.add((list.get((i) % 4) / list.get((3 + i) % 4)) + (list.get((1 + i) % 4) / list.get((2 + i) % 4)));
            }

            int index = 0;
            double max = -1;

            for (int i = 0; i < 4; i++) {
                if (max < sums.get(i)) {
                    max = sums.get(i);
                    index = i;
                }
            }

            bw.write(Integer.toString(index));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
