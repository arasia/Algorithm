package Question.No11723;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 11723

- 집합 (https://www.acmicpc.net/problem/11723)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            boolean[] array = new boolean[21];
            StringBuilder sb = new StringBuilder();

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                switch (st.nextToken()) {
                    case "add":
                        array[Integer.parseInt(st.nextToken())] = true;
                        break;
                    case "remove":
                        array[Integer.parseInt(st.nextToken())] = false;
                        break;
                    case "check":
                        sb.append(array[Integer.parseInt(st.nextToken())] ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        int index = Integer.parseInt(st.nextToken());
                        array[index] = !array[index];
                        break;
                    case "all":
                        Arrays.fill(array, true);
                        break;
                    case "empty":
                        Arrays.fill(array, false);
                    default:
                }
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
