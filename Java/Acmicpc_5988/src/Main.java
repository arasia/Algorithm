import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 5988

- 홀수일까 짝수일까 (https://www.acmicpc.net/problem/5988)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            while (N-- > 0) {
                String current = br.readLine();
                if (current.charAt(current.length() - 1) % 2 == 0) {
                    bw.write("even\n");
                } else {
                    bw.write("odd\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
