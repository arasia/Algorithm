package Question.No13305;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 13305

- 주유소 (https://www.acmicpc.net/problem/13305)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int count = Integer.parseInt(br.readLine());
            int[] paths = new int[count - 1];
            int[] oils = new int[count];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count - 1; i++) {
                paths[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count; i++) {
                oils[i] = Integer.parseInt(st.nextToken());
            }

            long moveDistance = 0;
            long result = 0;
            int lastOilPrice = oils[0];

            for (int i = 1; i < count; i++) {
                moveDistance += paths[i - 1];
                if (lastOilPrice > oils[i]) {
                    result += moveDistance * lastOilPrice;
                    lastOilPrice = oils[i];
                    moveDistance = 0;
                }
            }

            result += moveDistance * lastOilPrice;

            bw.write(Long.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
