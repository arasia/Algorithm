package question.a_3273;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 3273

- 두 수의 합 (https://www.acmicpc.net/problem/3273)
*/
public class Main {
    static int numSize;
    static int[] nums;
    static int target;

    public static void main(String[] args) {
        initInput();
        System.out.println(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            numSize = Integer.parseInt(br.readLine());
            nums = new int[numSize];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < numSize; i++) {
                nums[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(nums);

            target = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        int result = 0;
        int left = 0;
        int right = numSize - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                result++;
                left++;
                right--;
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return result;
    }
}
