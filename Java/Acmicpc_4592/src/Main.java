import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 4592

- 중복을 없애자 (https://www.acmicpc.net/problem/4592)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int n = Integer.parseInt(st.nextToken());
                if (n == 0) {
                    break;
                }
                int pre = -1;

                for (int i = 0; i < n; i++) {
                    int current = Integer.parseInt(st.nextToken());
                    if (pre != current) {
                        pre = current;
                        bw.write(current + " ");
                    }
                }

                bw.write("$\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
