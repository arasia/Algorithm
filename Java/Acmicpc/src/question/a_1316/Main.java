package question.a_1316;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int result = count;

        for(int i = 0 ; i < count ; i++) {
            String string = sc.next();
            int[] array = new int[26];
            Arrays.fill(array, -1);

            char preCh = string.charAt(0);
            array[(int)preCh - 97]++;

            for(int j = 0 ; j < string.length() ; j++) {
                char ch = string.charAt(j);
                if(preCh == ch) {
                    continue;
                } else {
                    preCh = ch;
                    if(array[(int)preCh - 97] == -1) {
                        array[(int) preCh - 97]++;
                    } else {
                        result--;
                        break;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
