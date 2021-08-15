package question.a_17293;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 17293

- 맥주 99병 (https://www.acmicpc.net/problem/17293)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();

            for (int i = n; i >= 0; i--) {
                sb.append(bottles(i, true));
                sb.append(" on the wall, ");
                sb.append(bottles(i, false));
                sb.append(".\n");

                if (i - 1 == -1) {
                    sb.append("Go to the store and buy some more, ");
                    sb.append(bottles(n, false));
                } else {
                    sb.append("Take one down and pass it around, ");
                    sb.append(bottles(i - 1, false));
                }

                sb.append(" on the wall.\n\n");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String bottles(int n, boolean flag) {
        StringBuilder sb = new StringBuilder();
        if (n > 0) {
            sb.append(n);
        } else {
            if (flag) {
                sb.append("No more");
            } else {
                sb.append("no more");
            }
        }

        if (n == 1) {
            sb.append(" bottle of beer");
        } else {
            sb.append(" bottles of beer");
        }

        return sb.toString();
    }
}
