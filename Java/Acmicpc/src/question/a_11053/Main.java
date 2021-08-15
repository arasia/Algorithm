package question.a_11053;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc
- 가장 긴 증가하는 부분 수열 (https://www.acmicpc.net/problem/11053)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            List<Integer> dp = new ArrayList<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
                dp.add(1);
            }

            for(int i = 1 ; i < N ; i++) {
                for(int j = 0 ; j < i ; j++) {
                    if(list.get(i) > list.get(j)) {
                        dp.set(i, Math.max(dp.get(j) + 1, dp.get(i)));
                    }
                }
            }

            bw.write(String.valueOf(Collections.max(dp)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
