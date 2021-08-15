package Question.No4619;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 4619

- 루트 (https://www.acmicpc.net/problem/4619)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int B = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());

                if (B == 0 && N == 0) {
                    break;
                }

                int index = 1;
                int a = 1, b;

                while (true) {
                    b = (int) Math.pow(index, N);

                    if (B > b) {
                        a = b;
                    } else {
                        break;
                    }

                    index++;
                }

                if (Math.abs(B - a) < Math.abs(B - b)) {
                    bw.write((index - 1) + "\n");
                } else {
                    bw.write(index + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
