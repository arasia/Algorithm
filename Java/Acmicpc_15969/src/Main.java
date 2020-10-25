import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 15969

- 행복 (https://www.acmicpc.net/problem/15969)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                min = Math.min(min, current);
                max = Math.max(max, current);
            }

            bw.write(Integer.toString(max - min));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
