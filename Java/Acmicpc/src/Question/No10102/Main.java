package Question.No10102;

import java.util.Scanner;

/*
Acmicpc 10102

- 개표 (https://www.acmicpc.net/problem/10102)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt(), result = 0;
        String input = sc.next();

        for (int i = 0; i < V; i++) {
            switch (input.charAt(i)) {
                case 'A' :
                    result++;
                    break;
                case 'B':
                    result--;
                    break;
            }
        }

        String output;
        if (result > 0) {
            output = "A";
        } else if (result == 0) {
            output = "Tie";
        } else {
            output = "B";
        }

        System.out.println(output);
    }
}
