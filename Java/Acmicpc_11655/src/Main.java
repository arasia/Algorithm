import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 11655

- ROT13 (https://www.acmicpc.net/problem/11655)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();

            for (char ch : input.toCharArray()) {
                if (ch >= 'a' && ch <= 'z') {
                    sb.append((char) ((ch - 'a' +  13) % 26 + 'a'));
                } else if (ch >= 'A' && ch <= 'Z') {
                    sb.append((char) ((ch - 'A' +  13) % 26 + 'A'));
                } else {
                    sb.append(ch);
                }
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
