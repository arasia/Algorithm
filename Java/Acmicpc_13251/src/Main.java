import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 13251

- 조약돌 꺼내기 (https://www.acmicpc.net/problem/13251)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int M = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int sum = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                int current = Integer.parseInt(st.nextToken());
                sum += current;
                list.add(current);
            }

            int K = Integer.parseInt(br.readLine());
            double result = 0;
            for (Integer integer : list) {
                if (integer < K) {
                    continue;
                }
                double part = 1;
                for (int i = 0; i < K; i++) {
                    part *= ((double) integer - i) / (sum - i);
                }

                result += part;
            }

            bw.write(Double.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
