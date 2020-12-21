import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 14910

- 오르막 (https://www.acmicpc.net/problem/14910)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int pre = Integer.parseInt(st.nextToken());
            boolean result = true;

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());

                if (pre > current) {
                    result = false;
                    break;
                }

                pre = current;
            }

            if (result) {
                bw.write("Good");
            } else {
                bw.write("Bad");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
