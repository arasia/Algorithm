package question.a_2470;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 2470

- 두 용액 (https://www.acmicpc.net/problem/2470)
*/
public class Main {
    static int numCount;
    static int[] nums;

    public static void main(String[] args) {
        initInput();
        printResult(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try (br) {
            numCount = Integer.parseInt(br.readLine());
            nums = new int[numCount];

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int i = 0; i < numCount; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Result solve() {
        Result result = new Result();

        Arrays.sort(nums);

        int left = 0;
        int right = numCount - 1;
        int max = 2_000_000_001;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (Math.abs(sum) < max) {
                result.first = nums[left];
                result.second = nums[right];
                max = Math.abs(sum);
            }

            if (sum > 0) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }

    private static void printResult(Result result) {
        System.out.println(result.first + " " + result.second);
    }

    static class Result {
        int first;
        int second;
    }
}
