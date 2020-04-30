import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1049

- 기타줄 (https://www.acmicpc.net/problem/1049)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int bundle = 1001;
            int single = 1001;

            for (int i = 0; i < M; i++) {
                st = new StringTokenizer(br.readLine());
                bundle = Math.min(bundle, Integer.parseInt(st.nextToken()));
                single = Math.min(single, Integer.parseInt(st.nextToken()));
            }

            if (bundle == 0 || single == 0) {
                bw.write("0");
            } else {
                int limit = bundle / single;

                int result;
                if (limit > 5) {
                    result = single * N;
                } else {
                    result = N / 6 * bundle;
                    if ((N % 6) > limit) {
                        result += bundle;
                    } else {
                        result += (N % 6) * single;
                    }
                }

                bw.write(String.valueOf(result));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
