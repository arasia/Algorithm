import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 카이사르 암호 (https://www.acmicpc.net/problem/5598)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input = br.readLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                if(ch > 67) {
                    ch -= 3;
                } else {
                    ch += 23;
                }
                result.append(ch);
            }
            bw.write(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
