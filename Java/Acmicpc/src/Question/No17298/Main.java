package Question.No17298;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

/*
Acmicpc 17298

- 오큰수 (https://www.acmicpc.net/problem/17298)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int count = Integer.parseInt(br.readLine());
            int[] arr = new int[count];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < count; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Deque<Integer> stack = new ArrayDeque<>();

            for (int i = 0; i < count; i++) {
                if (stack.isEmpty()) {
                    stack.push(i);
                    continue;
                }

                if (arr[i] > arr[stack.peek()]) {
                    while (!stack.isEmpty()) {
                        if (arr[i] <= arr[stack.peek()]) {
                            break;
                        }

                        arr[stack.pop()] = arr[i];
                    }
                }

                stack.push(i);
            }

            while (!stack.isEmpty()) {
                arr[stack.pop()] = -1;
            }

            for (int i : arr) {
                bw.write(i + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
