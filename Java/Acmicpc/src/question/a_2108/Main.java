package question.a_2108;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Acmicpc 2108

- 통계학 (https://www.acmicpc.net/problem/2108)
*/
public class Main {
    static int numCount;
    static int[] nums;

    public static void main(String[] args) {
        initInput();
        solve();
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            numCount = Integer.parseInt(br.readLine());
            nums = new int[8001];

            for (int i = 0; i < numCount; i++) {
                nums[Integer.parseInt(br.readLine()) + 4000]++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void solve() {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int mid = 0;
        int midCount = 0;
        int mode = 0;
        int modeCount = 0;
        boolean firstModeFlag = false;

        for (int i = 0; i <= 8000; i++) {
            if (nums[i] == 0) {
                continue;
            }

            sum += (i - 4000) * nums[i];

            if (i > max) {
                max = i;
            }

            if (i < min) {
                min = i;
            }

            if (midCount < (numCount + 1) / 2) {
                midCount += nums[i];
                mid = i - 4000;
            }

            if (modeCount < nums[i]) {
                modeCount = nums[i];
                mode = i - 4000;
                firstModeFlag = true;
            } else if (modeCount == nums[i] && firstModeFlag) {
                mode = i - 4000;
                firstModeFlag = false;
            }
        }

        System.out.println((int) Math.round((double) sum / numCount));
        System.out.println(mid);
        System.out.println(mode);
        System.out.println(max - min);
    }
}
