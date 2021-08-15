package question.a_14954;

import java.util.Vector;

/*
Acmicpc 14954

- Happy Number (https://www.acmicpc.net/problem/14954)
*/
public class Main {
    public static void main(String[] args) {
        int input = new java.util.Scanner(System.in).nextInt();
        Vector<Integer> vector = new Vector<>();

        while (!vector.contains(input)) {
            vector.add(input);

            int current = 0;
            while (input > 0) {
                current += Math.pow(input % 10, 2);
                input /= 10;
            }
            input = current;
        }

        if (input == 1) {
            System.out.println("HAPPY");
        } else {
            System.out.println("UNHAPPY");
        }
    }
}
