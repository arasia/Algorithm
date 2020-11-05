import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 4796

- 캠핑 (https://www.acmicpc.net/problem/4796)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int i = 1;
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int L = Integer.parseInt(st.nextToken());
                int P = Integer.parseInt(st.nextToken());
                int V = Integer.parseInt(st.nextToken());
                if (L == 0 && P == 0 && V == 0) {
                    break;
                }

                bw.write("Case " + (i++) + ": " + (((V / P) * L) + Math.min(L, V % P)) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
