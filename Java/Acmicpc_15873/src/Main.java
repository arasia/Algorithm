import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 15873

- 공백 없는 A+B (https://www.acmicpc.net/problem/15873)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input = br.readLine();
            int index = input.charAt(1) == '0' ? 2 : 1;
            bw.write(String.valueOf(Integer.parseInt(input.substring(0, index)) + Integer.parseInt(input.substring(index))));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
