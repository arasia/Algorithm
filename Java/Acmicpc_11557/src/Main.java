import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 11557

- Yangjojang of The Year (https://www.acmicpc.net/problem/11557)
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
                String result = "";
                int max = -1;

                while (N-- > 0) {
                    StringTokenizer st = new StringTokenizer(br.readLine());
                    String S = st.nextToken();
                    int L = Integer.parseInt(st.nextToken());

                    if (max < L) {
                        result = S;
                        max = L;
                    }
                }

                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
