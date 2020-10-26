import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 20053

- 최소, 최대 2 (https://www.acmicpc.net/problem/20053)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                int N = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

                while (st.hasMoreTokens()) {
                    int current = Integer.parseInt(st.nextToken());
                    min = Math.min(min, current);
                    max = Math.max(max, current);
                }

                bw.write(min + " " + max + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
