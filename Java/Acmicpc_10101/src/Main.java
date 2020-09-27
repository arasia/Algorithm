import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Acmicpc 10101

- 삼각형 외우기 (https://www.acmicpc.net/problem/10101)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextInt());
        }
        int sum = list.stream().mapToInt(Integer::intValue).sum();

        if (sum == 180) {
            int max = 0;
            for (int i = 0; i < 3; i++) {
                int count = 1;
                for (int j = 0; j < 3; j++) {
                    if (i != j) {
                        if (list.get(i).equals(list.get(j))) {
                            count++;
                        }
                    }
                }
                max = Math.max(max, count);
            }

            switch (max) {
                case 3:
                    System.out.println("Equilateral");
                    break;
                case 2:
                    System.out.println("Isosceles");
                    break;
                case 1:
                    System.out.println("Scalene");
            }
        } else {
            System.out.println("Error");
        }
    }
}
