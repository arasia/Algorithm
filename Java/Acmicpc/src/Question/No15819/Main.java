package Question.No15819;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 15819

- 너의 핸들은 (https://www.acmicpc.net/problem/15819)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), I = Integer.parseInt(st.nextToken());
            List<String> list = new ArrayList<>();

            while (N-- > 0) {
                list.add(br.readLine());
            }

            list.sort(String::compareTo);

            bw.write(list.get(I - 1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
