package question.a_2512;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 2512

- 예산 (https://www.acmicpc.net/problem/2512)
*/
public class Main {
    static int N;
    static List<Integer> list;
    static int money;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            N = Integer.parseInt(br.readLine());

            list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int left = 0, right = Integer.MIN_VALUE;

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                list.add(current);
                right = Math.max(right, current);
            }

            money = Integer.parseInt(br.readLine());

            while (left <= right) {
                int mid = (left + right) / 2;

                int checkPrice = checker(mid);

                if (checkPrice == money) {
                    right = mid;
                    break;
                } else if (checkPrice > money) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            bw.write(String.valueOf(right));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int checker(int mid) {
        int result = 0;

        for (Integer integer : list) {
            if (integer < mid) {
                result += integer;
            } else {
                result += mid;
            }
        }

        return result;
    }
}
