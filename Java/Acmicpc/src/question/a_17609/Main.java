package question.a_17609;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 17609

- 회문 (https://www.acmicpc.net/problem/17609)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                bw.write(checker(br.readLine()) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int checker(String input) {
        int left = 0, right = input.length() - 1;
        int result = 0;

        while (left < right) {
            if (input.charAt(left) == input.charAt(right)) {
                left++;
                right--;
            } else {
                if (checker2(input, left, right - 1)) {
                    result = 1;
                    break;
                } else {
                    if (checker2(input, left + 1, right)) {
                        result = 1;
                    } else {
                        result = 2;
                    }
                    break;
                }
            }
        }

        return result;
    }

    private static boolean checker2(String input, int left, int right) {
        boolean check = true;
        while (left < right) {
            if (input.charAt(left) == input.charAt(right)) {
                left++;
                right--;
            } else {
                check = false;
                break;
            }
        }
        return check;
    }
}
