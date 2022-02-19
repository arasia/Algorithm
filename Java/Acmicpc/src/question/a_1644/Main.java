package question.a_1644;

import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 1644

- 소수의 연속합 (https://www.acmicpc.net/problem/1644)
*/
public class Main {
    static boolean[] prime;
    static List<Integer> primeNumbers = new ArrayList<>();

    public static void main(String[] args) {
        final int target = new java.util.Scanner(System.in).nextInt();

        findPrime(target);
        System.out.println(solve(target));
    }

    private static void findPrime(final int target) {
        prime = new boolean[target + 1];
        prime[0] = true;
        prime[1] = true;

        for (int i = 2; i * i <= target; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= target; j += i) {
                    prime[j] = true;
                }
            }
        }

        for (int i = 2; i <= target; i++) {
            if (!prime[i]) {
                primeNumbers.add(i);
            }
        }
    }

    private static int solve(final int target) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = 0;

        while (true) {
            if (sum >= target) {
                sum -= primeNumbers.get(left++);
            } else if (right == primeNumbers.size()) {
                break;
            } else {
                sum += primeNumbers.get(right++);
            }

            if (sum == target) {
                count++;
            }
        }

        return count;
    }
}
