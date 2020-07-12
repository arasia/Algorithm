/*
Acmicpc 9625

- BABBA (https://www.acmicpc.net/problem/9625)
*/
public class Main {
    public static void main(String[] args) {
        int A = 1, B = 0, K = new java.util.Scanner(System.in).nextInt();

        for (int i = 0; i < K; i++) {
            int temp = B;
            B = A + B;
            A = temp;
        }

        System.out.println(A + " " + B);
    }
}
