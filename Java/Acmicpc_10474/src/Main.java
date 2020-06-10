import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10474

- 분수좋아해? (https://www.acmicpc.net/problem/10474)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());

                if (A == 0 && B == 0) {
                    break;
                }

                int N = A / B;
                int mod = A % B;

                bw.write(N + " " + mod + " / " + B + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
