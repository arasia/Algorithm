package question.a_9610;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 9610

- 사분면 (https://www.acmicpc.net/problem/9610)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] result = new int[5];
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                String[] input = br.readLine().split(" ");
                int x = Integer.parseInt(input[0]), y = Integer.parseInt(input[1]);

                if (x == 0 | y == 0) {
                    result[0]++;
                } else {
                    if (x > 0) {
                        if (y > 0) {
                            result[1]++;
                        } else {
                            result[4]++;
                        }
                    } else {
                        if (y > 0) {
                            result[2]++;
                        } else {
                            result[3]++;
                        }
                    }
                }
            }

            for (int i = 1; i <= 4; i++) {
                bw.write("Q" + i + ": " + result[i] + "\n");
            }
            bw.write("AXIS: " + result[0]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
