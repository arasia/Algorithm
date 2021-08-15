package question.a_15904;

import java.util.Scanner;
import java.util.Vector;

/*
Acmicpc 15904

- UCPC는 무엇의 약자일까? (https://www.acmicpc.net/problem/15904)
*/
public class Main {
    public static void main(String[] args) {
        char[] input = new Scanner(System.in).nextLine().toCharArray();
        Vector<Character> vector = new Vector<>();

        for (char c : input) {
            switch (c) {
                case 'C':
                case 'P':
                case 'U':
                    vector.add(c);
                default:
                    break;
            }
        }

        char[] checker = {'U', 'C', 'P', 'C'};
        int index = 0;

        for (Character character : vector) {
            if (character.equals(checker[index])) {
                index++;
                if (index == 4) {
                    break;
                }
            }
        }

        if (index == 4) {
            System.out.println("I love UCPC");
        } else {
            System.out.println("I hate UCPC");
        }
    }
}
