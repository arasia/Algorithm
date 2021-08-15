package Question.No10833;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10833

- 사과 (https://www.acmicpc.net/problem/10833)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int student = Integer.parseInt(st.nextToken());
                int apple = Integer.parseInt(st.nextToken());
                result += apple % student;
            }
            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
