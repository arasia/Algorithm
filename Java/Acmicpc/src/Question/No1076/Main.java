package Question.No1076;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 저항 (https://www.acmicpc.net/problem/1076)
 */
public class Main {

    public enum Color {
        black(0, 1),
        brown(1, 10),
        red(2, 100),
        orange(3, 1000),
        yellow(4, 10000),
        green(5, 100000),
        blue(6, 1000000),
        violet(7, 10000000),
        grey(8, 100000000),
        white(9, 1000000000);

        private int value;
        private int multiple;

        Color(int value, int multiple) {
            this.value = value;
            this.multiple = multiple;
        }
    }

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String first = br.readLine();
            String second = br.readLine();
            String third = br.readLine();

            long result = (long)(Color.valueOf(first).value * 10 + Color.valueOf(second).value) * Color.valueOf(third).multiple;

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
