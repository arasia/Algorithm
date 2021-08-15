package Question.No2847;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 2847

- 게임을 만든 동준이 (https://www.acmicpc.net/problem/2847)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine()), result = 0;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            for (int i = N - 1; i > 0; i--) {
                int pre = list.get(i - 1), next = list.get(i);
                if (pre >= next) {
                    result += pre - next + 1;
                    list.set(i - 1, next - 1);
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
