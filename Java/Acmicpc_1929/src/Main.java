import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc
- 소수 구하기 (https://www.acmicpc.net/problem/1929)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int[] arr = new int[N + 1];
            Arrays.fill(arr, 0);

            for (int i = 2; i <= N; i++) {
                int current = i;
                if (arr[current] == 0) {
                    if (current >= M) {
                        bw.write(current + "\n");
                    }

                    while (current <= N) {
                        arr[current] = 1;
                        current += i;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
