import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc
- 별 찍기 - 8 (https://www.acmicpc.net/problem/2445)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            for (int i = 1; i <= N; i++) {
                bw.write("*".repeat(i) + " ".repeat((N - i) * 2) + "*".repeat(i) + "\n");
            }
            for (int i = N -1; i > 0; i--) {
                bw.write("*".repeat(i) + " ".repeat((N - i) * 2) + "*".repeat(i) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
