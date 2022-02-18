package question.a_1806;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
Acmicpc 1806

- 부분합 (https://www.acmicpc.net/problem/1806)
*/
public class Main {
    static int numCount;
    static int sumTarget;
    static int[] nums;

    public static void main(String[] args) {
        initInput();
        System.out.println(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());
            numCount = Integer.parseInt(st.nextToken());
            sumTarget = Integer.parseInt(st.nextToken());
            nums = new int[numCount];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numCount; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        int minLength = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;
        int sum = 0;

        while (true) {
            if (sum >= sumTarget) {
                minLength = Math.min(minLength, right - left);
                sum -= nums[left++];
            } else {
                if (right == numCount) {
                    break;
                }

                sum += nums[right++];
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}
