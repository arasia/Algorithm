package question.a_1759;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 암호 만들기 (https://www.acmicpc.net/problem/1759)
 */
public class Main {
    public static List<String> chars = new ArrayList<>();
    public static List<String> vowels = new ArrayList<>();
    public static List<String> checkedVowels = new ArrayList<>();
    public static boolean[] check;
    public static StringBuilder sb;
    public static int L;
    public static int C;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            L = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            check = new boolean[C];

            vowels.add("a");
            vowels.add("e");
            vowels.add("i");
            vowels.add("o");
            vowels.add("u");

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < C; i++) {
                String current = st.nextToken();
                chars.add(current);
                if (vowels.contains(current)) {
                    checkedVowels.add(current);
                }
            }
            Collections.sort(chars);

            sb = new StringBuilder();
            passwordMaker(0, 0, "");

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void passwordMaker(int current, int length, String string) {
        if(length == L) {
            if (checker(string)) {
                sb.append(string).append("\n");
            }
        } else {
            for (int i = current; i < C; i++) {
                if (!check[i]) {
                    check[i] = true;
                    passwordMaker(i, length + 1, string + chars.get(i));
                    check[i] = false;
                }
            }
        }
    }

    private static boolean checker(String string) {
        int vowelCount = 0;

        for (String vowel : checkedVowels) {
            if (string.contains(vowel)) {
                vowelCount++;
            }
        }
        return (vowelCount > 0) && ((string.length() - vowelCount) > 1);
    }
}
