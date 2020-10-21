import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 10865

- 친구 친구 (https://www.acmicpc.net/problem/10865)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            int[] friends = new int[N + 1];

            while (M-- > 0) {
                st = new StringTokenizer(br.readLine());
                friends[Integer.parseInt(st.nextToken())]++;
                friends[Integer.parseInt(st.nextToken())]++;
            }

            for (int i = 1; i <= N; i++) {
                bw.write(friends[i] +  "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
