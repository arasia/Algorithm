/*
Acmicpc 5585

- 거스름돈 (https://www.acmicpc.net/problem/5585)
*/
public class Main {
    public static void main(String[] args) {
        int result = 0, charge = 1000 - new java.util.Scanner(System.in).nextInt();
        int[] coin = {500, 100, 50, 10, 5, 1};

        for (int i : coin) {
            result += charge / i;
            charge = charge % i;
        }

        System.out.println(result);
    }
}
