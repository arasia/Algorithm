package question.a_1259;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 1259

- 펠린드롬수 (https://www.acmicpc.net/problem/1259)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                String current = br.readLine();
                if (current.equals("0")) {
                    break;
                }

                boolean check = true;
                for (int i = 0; i < current.length() / 2; i++) {
                    if (current.charAt(i) != current.charAt(current.length() - i - 1)) {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    bw.write("yes\n");
                } else {
                    bw.write("no\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
