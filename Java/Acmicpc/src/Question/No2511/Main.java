package Question.No2511;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 2511

- 카드놀이 (https://www.acmicpc.net/problem/2511)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            List<Integer> list1 = new ArrayList<>();
            List<Integer> list2 = new ArrayList<>();

            while (st1.hasMoreTokens()) {
                list1.add(Integer.parseInt(st1.nextToken()));
            }

            while (st2.hasMoreTokens()) {
                list2.add(Integer.parseInt(st2.nextToken()));
            }

            int A = 0, B = 0, last = -1;

            for (int i = 0; i < 10; i++) {
                if (list1.get(i) > list2.get(i)) {
                    A += 3;
                    last = 1;
                } else if (list1.get(i).equals(list2.get(i))) {
                    A++;
                    B++;
                } else {
                    B += 3;
                    last = 2;
                }
            }

            String result;
            if (A > B) {
                result = "A";
            } else if (A < B) {
                result = "B";
            } else {
                if (last == 1) {
                    result = "A";
                } else if (last == 2) {
                    result = "B";
                } else {
                    result = "D";
                }
            }

            bw.write(A + " " +  B + "\n");
            bw.write(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
