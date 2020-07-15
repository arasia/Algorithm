import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 14659

- 한조서열정리하고옴ㅋㅋ (https://www.acmicpc.net/problem/14659)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int high = 0, max = 0, count = 0, N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                if (current > high) {
                    max = Math.max(max, count);
                    count = 0;
                    high = current;
                } else {
                    count++;
                }
            }

            bw.write(String.valueOf(Math.max(max, count)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
