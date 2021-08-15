package question.a_15036;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 15036

- Jush A Minim (https://www.acmicpc.net/problem/15036)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            double result = 0;
            boolean check = true;

            while (st.hasMoreTokens()) {
                switch (Integer.parseInt(st.nextToken())) {
                    case 0:
                        result += 2;
                        break;
                    case 1:
                        result += 1;
                        break;
                    case 2:
                        result += 0.5;
                        check = false;
                        break;
                    case 4:
                        result += 0.25;
                        check = false;
                        break;
                    case 8:
                        result += 0.125;
                        check = false;
                        break;
                    case 16:
                        result += 0.0625;
                        check = false;
                        break;
                }
            }
            if (check) {
                bw.write(String.valueOf((int) result));
            } else {
                bw.write(String.valueOf(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
