import java.util.Scanner;

/*
Acmicpc 5575

- 타임 카드 (https://www.acmicpc.net/problem/5575)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 3;
        StringBuilder sb = new StringBuilder();

        while (N-- > 0) {
            String[] input = sc.nextLine().split(" ");

            int start = timeToSec(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2]));
            int finish = timeToSec(Integer.parseInt(input[3]), Integer.parseInt(input[4]), Integer.parseInt(input[5]));

            int workSec = finish - start;
            sb.append(secToTime(workSec));
        }

        System.out.println(sb.toString());
    }

    private static String secToTime(int workSec) {
        StringBuilder sb = new StringBuilder();
        int div = 3600;

        while (true) {
            sb.append(workSec / div);

            if (div == 1) {
                break;
            }
            sb.append(" ");
            workSec %= div;
            div /= 60;
        }

        return sb.append("\n").toString();
    }

    private static int timeToSec(int hour, int min, int sec) {
        return hour * 3600 + min * 60 + sec;
    }
}
