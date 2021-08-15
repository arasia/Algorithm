package question.a_11931;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
Acmicpc 11931

- 수 정렬하기 4 (https://www.acmicpc.net/problem/11931)
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

            list.stream()
                    .sorted(Comparator.reverseOrder())
                    .forEach(v -> {
                        try {
                            bw.write(v + "\n");
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
