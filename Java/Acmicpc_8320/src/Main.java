import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 8320

- 직사각형을 만드는 방법 (https://www.acmicpc.net/problem/8320)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j*i <= n ; j++) {
                    result++;
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
