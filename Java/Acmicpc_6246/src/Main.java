import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 6246

- 풍선 놀이 (https://www.acmicpc.net/problem/6246)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), Q = Integer.parseInt(st.nextToken());
            boolean[] check = new boolean[N + 1];
            int result = N;

            while (Q-- > 0) {
                st = new StringTokenizer(br.readLine());
                int L = Integer.parseInt(st.nextToken()), I = Integer.parseInt(st.nextToken());

                for (int i = L; i <= N; i += I) {
                    if (!check[i]) {
                        check[i] = true;
                        result--;
                    }
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
