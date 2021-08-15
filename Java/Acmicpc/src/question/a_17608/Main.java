package question.a_17608;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Acmicpc 17608

- 막대기 (https://www.acmicpc.net/problem/17608)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int max = -1;
            int current = Integer.MAX_VALUE;
            List<Integer> list = new LinkedList<>();
            while (N-- > 0) {
                current = Integer.parseInt(br.readLine());
                if (current > max) {
                    max = current;
                    list.clear();
                }
                list.add(current);
            }

            int result = 1;
            ListIterator<Integer> listIterator = list.listIterator(list.size());

            while (listIterator.hasPrevious()) {
                int cur = listIterator.previous();
                if (cur > current) {
                    current = cur;
                    result++;
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
