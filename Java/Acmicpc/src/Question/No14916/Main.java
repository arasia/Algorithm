package Question.No14916;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 14916

- 거스름돈 (https://www.acmicpc.net/problem/14916)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int money = Integer.parseInt(br.readLine());
            int result5 = -1;
            for (int i = money / 5; i >= 0; i--) {
                if ((money - (5 * i)) % 2 == 0) {
                    result5 = i;
                    break;
                }
            }

            if (result5 == -1) {
                bw.write("-1");
            } else {
                bw.write(Integer.toString(result5 + (money - (5 * result5)) / 2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
