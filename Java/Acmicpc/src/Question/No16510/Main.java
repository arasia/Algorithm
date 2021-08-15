package Question.No16510;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 16510

- Predictable Queue (https://www.acmicpc.net/problem/16510)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
            int[] arr = new int[N + 1];

            st = new StringTokenizer(br.readLine());
            arr[0] = 0;
            for (int i = 1; i <= N; i++) {
                arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken());
            }

            while (M-- > 0) {
                int hour = Integer.parseInt(br.readLine());

                int left = 1, right = N;
                boolean flag = true;

                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (arr[mid] > hour) {
                        right = mid -1;
                    } else if (arr[mid] < hour) {
                        left = mid + 1;
                    } else {
                        bw.write(mid + "\n");
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    bw.write(right + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
