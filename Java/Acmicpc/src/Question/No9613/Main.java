package Question.No9613;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 9613

- GCD 합 (https://www.acmicpc.net/problem/9613)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                List<Integer> list = new LinkedList<>();
                long result = 0;

                while (st.hasMoreTokens()) {
                    list.add(Integer.parseInt(st.nextToken()));
                }

                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        result += gcd(list.get(i), list.get(j));
                    }
                }
                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int gcd(int a, int b) {
        int temp;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
