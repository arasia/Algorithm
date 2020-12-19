import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 20361

- 일우는 야바위꾼 (https://www.acmicpc.net/problem/20361)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), X = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

            while (K-- > 0) {
                st = new StringTokenizer(br.readLine());
                int A = Integer.parseInt(st.nextToken()), B = Integer.parseInt(st.nextToken());

                if (A == X) {
                    X = B;
                } else if (B == X) {
                    X = A;
                }
            }

            bw.write(Integer.toString(X));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
