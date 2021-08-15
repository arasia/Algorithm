package Question.No7785;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 7785

- 회사에 있는 사람 (https://www.acmicpc.net/problem/7785)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Set<String> set = new HashSet<>();

            while (N-- > 0) {
                String[] input = br.readLine().split(" ");

                if (input[1].equals("enter")) {
                    set.add(input[0]);
                } else {
                    set.remove(input[0]);
                }
            }

            List<String> sorted = new ArrayList<>(set);
            Collections.sort(sorted);

            ListIterator<String> listIterator = sorted.listIterator(sorted.size());

            while (listIterator.hasPrevious()) {
                bw.write(listIterator.previous() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
