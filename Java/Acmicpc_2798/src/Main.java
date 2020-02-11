import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 블랙잭 (https://www.acmicpc.net/problem/2798)
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
            int result = 0;
            List<Integer> cards = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                cards.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(cards);

            for (int i = 0; i < N - 2; i++) {
                for (int j = i + 1; j < N - 1; j++) {
                    for (int k = j + 1; k < N; k++) {
                        int sum = cards.get(i) + cards.get(j) + cards.get(k);

                        if ((sum <= M) && (sum > result)) {
                            result = sum;
                            break;
                        }
                    }
                }
            }

            bw.write(String.valueOf(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
