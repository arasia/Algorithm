import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 20113

- 긴급 회의 (https://www.acmicpc.net/problem/20113)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[] list = new int[N + 1];
            StringTokenizer st = new StringTokenizer(br.readLine());

            while (st.hasMoreTokens()) {
                list[Integer.parseInt(st.nextToken())]++;
            }

            int index = 0, duplicate = 0, max = -1;

            for (int i = 1; i <= N; i++) {
                if (list[i] > max) {
                    index = i;
                    duplicate = 0;
                    max = list[i];
                } else if (list[i] == max) {
                    duplicate++;
                }
            }

            if (duplicate != 0) {
                bw.write("skipped");
            } else {
                bw.write(Integer.toString(index));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
