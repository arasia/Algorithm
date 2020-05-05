import java.util.Scanner;

/*
Acmicpc 2669

- 직사각형 네개의 합집합의 면적 구하기 (https://www.acmicpc.net/problem/2669)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] check = new boolean[100][100];
        int n = 4;
        int result = 0;
        while (n-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            for (int i = x1; i < x2 ; i++) {
                for (int j = y1; j < y2; j++) {
                    if (!check[i][j]) {
                        result++;
                        check[i][j] = true;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
