package Question.No1065;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc
- 한수 (https://www.acmicpc.net/problem/1065)
 */
public class Main {
    public static void main(String[] args) {
        int N = 0;
        int result;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }

        result = N > 99 ? 99 : N;

        for(int i = 100 ; i<=N && i != 1000 ;i++) {
            int current = i;
            List<Integer> list  = new ArrayList<>();
            while(true) {
                if(current > 0) {
                    list.add(current%10);
                    current/=10;
                } else {
                    break;
                }
            }
            if((list.get(0) - list.get(1)) == (list.get(1) - list.get(2))) {
                result++;
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
