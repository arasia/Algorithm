import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 14468

- 소가 길을 건너간 이유 2 (https://www.acmicpc.net/problem/14468)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[][] cows = new int[26][2];
            char[] input = br.readLine().toCharArray();

            for (int i = 0; i < 52; i++) {
                int cowNum = input[i] - 'A';
                if (cows[cowNum][0] == 0) {
                    cows[cowNum][0] = i + 1;
                } else {
                    cows[cowNum][1] = i + 1;
                }
            }

            int result = 0;
            for (int i = 0; i < 26; i++) {
                int x1 = cows[i][0];
                int x2 = cows[i][1];

                for (int j = 0; j < 26; j++) {
                    int y1 = cows[j][0];
                    int y2 = cows[j][1];

                    if ((x1 < y1) && (y1 < x2) && (x2 < y2)) {
                        result++;
                    }
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
