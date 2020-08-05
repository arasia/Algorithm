import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 5596

- 시험 점수 (https://www.acmicpc.net/problem/5596)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int result = 0;

            for (int i = 0; i < 2; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int temp = 0;

                while (st.hasMoreTokens()) {
                    temp += Integer.parseInt(st.nextToken());
                }

                result = Math.max(result, temp);
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
