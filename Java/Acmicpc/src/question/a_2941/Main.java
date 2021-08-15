package question.a_2941;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input = new Scanner(System.in).nextLine();
        int result = input.length();
        String[] token = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i = result-1 ; i > 0 ; ) {
            char cur = input.charAt(i), next;
            switch (cur) {
                case '=' :
                    next = input.charAt(i-1);
                    switch(next) {
                        case 'c' :
                        case 's' :
                            result -= 1;
                            i -= 2;
                            break;
                        case 'z' :
                            if(((i-2) > -1) && (input.charAt(i-2) == 'd')) {
                                result -= 2;
                                i -= 3;
                            } else {
                                result -= 1;
                                i -= 2;
                            }
                    }
                    break;
                case '-' :
                    result -= 1;
                    i -= 2;
                    break;
                case 'j' :
                    next = input.charAt(i-1);
                    if(next == 'l' || next =='n') {
                        result -= 1;
                        i -= 2;
                    } else {
                        i -= 1;
                    }
                    break;
                default :
                    i -= 1;
            }
        }
        System.out.println(result);
    }
}
