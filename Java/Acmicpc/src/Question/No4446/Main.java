package Question.No4446;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

/*
Acmicpc 4446

- ROT13 (https://www.acmicpc.net/problem/4446)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input;
            StringBuilder result = new StringBuilder();

            while ((input = br.readLine()) != null) {
                for (char c : input.toCharArray()) {
                    result.append(changer(c));
                }

                result.append("\n");
            }

            bw.write(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final List<Character> mo = Arrays.asList('a', 'i', 'y', 'e', 'o', 'u');
    private static final List<Character> ja = Arrays.asList('b', 'k', 'x', 'z', 'n', 'h', 'd', 'c', 'w', 'g', 'p', 'v', 'j', 'q', 't', 's', 'r', 'l', 'm', 'f');

    private static char changer(char c) {
        if (!Character.isAlphabetic(c)) {
            return c;
        }

        boolean upperCase = false;

        if (!Character.isLowerCase(c)) {
            upperCase = true;
            c = Character.toLowerCase(c);
        }

        if (mo.contains(c)) {
            c = mo.get((mo.indexOf(c) + 3) % 6);
        } else {
            c = ja.get((ja.indexOf(c) + 10) % 20);
        }

        if (upperCase) {
            return Character.toUpperCase(c);
        } else {
            return c;
        }
    }
}
