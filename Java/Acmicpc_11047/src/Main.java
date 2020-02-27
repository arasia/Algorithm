import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
Acmicpc
- 동전 0 (https://www.acmicpc.net/problem/11047)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            Stack<Integer> integers = new Stack<>();

            while (N-- > 0) {
                integers.add(Integer.parseInt(br.readLine()));
            }

            int result = 0;
            while (K > 0) {
                int current = integers.pop();
                int count;

                count = K / current;
                result += count;
                K -= current * count;
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
