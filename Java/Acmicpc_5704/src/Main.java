import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 5704

- 팬그램 (https://www.acmicpc.net/problem/5704)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                String input = br.readLine();

                if (input.equals("*")) {
                    break;
                }

                boolean[] checker = new boolean[26];
                int count = 0;
                for (char ch : input.toCharArray()) {
                    if (ch != ' ' && !checker[ch - 'a']) {
                        checker[ch - 'a'] = true;
                        count++;
                    }
                }

                if (count == 26) {
                    bw.write("Y\n");
                } else {
                    bw.write("N\n");
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
