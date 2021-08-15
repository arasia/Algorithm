package Question.No2012;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 2012

- 등수 매기기 (https://www.acmicpc.net/problem/2012)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            long result = 0;
            list.sort(Integer::compareTo);

            for (int i = 0; i < N; i++) {
                result += Math.abs(list.get(i) - i - 1);
            }

            bw.write(Long.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
