package question.a_11718;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            String input = sc.nextLine();
            if(input.isEmpty()) {
                break;
            }
            System.out.println(input);
        }
    }
}
