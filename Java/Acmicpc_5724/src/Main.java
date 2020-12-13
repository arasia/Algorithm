import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 5724

- 파인만 (https://www.acmicpc.net/problem/5724)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                int N = Integer.parseInt(br.readLine());
                if (N == 0) {
                    break;
                }

                int result = 0;
                while (N > 0) {
                    result += N * N;
                    N--;
                }

                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
