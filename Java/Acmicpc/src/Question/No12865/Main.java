package Question.No12865;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
Acmicpc 12865

- 평범한 배낭 (https://www.acmicpc.net/problem/12865)
*/
public class Main {
    public static void main(String[] args) {
        try (
                var br = new BufferedReader(new InputStreamReader(System.in));
                var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            var st = new StringTokenizer(br.readLine());
            var N = Integer.parseInt(st.nextToken());
            var K = Integer.parseInt(st.nextToken());

            ArrayList<Item> itemList = new ArrayList<>();
            itemList.add(new Item(0, 0));
            for (var i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                itemList.add(new Item(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            var dp = new int[N + 1][K + 1];

            for (var i = 1; i <= N; i++) {
                var item = itemList.get(i);

                for (var j = 1; j <= K; j++) {
                    if (item.weight > j) {
                        dp[i][j] = dp[i - 1][j];
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - item.weight] + item.value);
                    }
                }
            }

            bw.write(Integer.toString(dp[N][K]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Item {
        int weight;
        int value;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
