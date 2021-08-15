package question.a_17952;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

/*
Acmicpc 17952

- 과제는 끝나지 않아! (https://www.acmicpc.net/problem/17952)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            Stack<Assignment> stack = new Stack<>();

            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                if (st.nextToken().equals("1")) {
                    stack.push(new Assignment(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
                }

                if (!stack.empty()) {
                    Assignment current = stack.pop();
                    if (current.remainTime == 1) {
                        result += current.point;
                    } else {
                        current.remainTime--;
                        stack.push(current);
                    }
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Assignment {
        int point;
        int remainTime;

        public Assignment(int point, int remainTime) {
            this.point = point;
            this.remainTime = remainTime;
        }
    }
}
