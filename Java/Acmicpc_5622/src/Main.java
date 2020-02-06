import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 다이얼 (https://www.acmicpc.net/problem/5622)
 */
public class Main {

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input = br.readLine();

            int result = 0;
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if(ch < 'T') {
                    result += Math.min((((ch - 2) / 3) - 18), 8);
                } else {
                    result += Math.min(((ch / 3) - 19), 10);
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
