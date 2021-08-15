package Question.No9663;

/*
Acmicpc 9663

- N-Queen (https://www.acmicpc.net/problem/9663)
*/
public class Main {
    public static int N;
    public static int count = 0;
    public static int[] arr;

    public static void main(String[] args) {
        N = new java.util.Scanner(System.in).nextInt();
        arr = new int[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[1] = i;
            dfs(1);
        }

        System.out.println(count);
    }

    private static void dfs(int row) {
        if (row == N) {
            count++;
        } else {
            for (int i = 1; i <= N ; i++) {
                arr[row + 1] = i;
                if (checker(row + 1)) {
                    dfs(row + 1);
                } else {
                    arr[row + 1] = 0;
                }
            }
        }
        arr[row] = 0;
    }

    private static boolean checker(int row) {
        for (int i = 1; i < row; i++) {
            if (arr[i] == arr[row]) {
                return false;
            }

            if (Math.abs(arr[i] - arr[row]) == (row - i)) {
                return false;
            }
        }

        return true;
    }
}
