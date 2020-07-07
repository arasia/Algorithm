/*
Acmicpc 1541

- 잃어버린 괄호 (https://www.acmicpc.net/problem/1541)
*/
public class Main {
    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).next();
        String[] arr = input.split("-");
        int result = 0;
        boolean first = false;

        for (String s : arr) {
            String[] temp = s.split("\\+");
            int sum = 0;
            for (String s1 : temp) {
                sum += Integer.parseInt(s1);
            }
            if (first) {
                result -= sum;
            } else {
                result += sum;
                first = true;
            }
        }
        System.out.println(result);
    }
}
