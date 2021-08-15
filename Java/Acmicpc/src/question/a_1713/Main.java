package question.a_1713;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 1713

- 후보 추천하기 (https://www.acmicpc.net/problem/1713)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int M = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            List<Integer> list = new LinkedList<>();
            int[] point = new int[101];

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());

                if (list.size() < N) {
                    if (!list.contains(current)) {
                        list.add(current);
                        point[current] = 0;
                    }
                } else {
                    if (!list.contains(current)) {
                        int min = 1001;
                        int index = 0;
                        int num = 0;
                        for (int i = 0; i < list.size(); i++) {
                            int integer = list.get(i);

                            if (point[integer] < min) {
                                index = i;
                                num = integer;
                                min = point[integer];
                            }
                        }

                        list.remove(index);
                        point[num] = 0;
                        list.add(current);
                        point[current] = 0;
                    }
                }
                point[current]++;
            }

            Collections.sort(list);

            for (Integer integer : list) {
                bw.write(integer + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
