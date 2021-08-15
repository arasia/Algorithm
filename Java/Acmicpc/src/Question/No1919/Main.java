package Question.No1919;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 1919

- 에너그램 만들기 (https://www.acmicpc.net/problem/1919)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int[] checkA = new int[26];
            int[] checkB = new int[26];
            String a = br.readLine();
            String b = br.readLine();

            for (int i = 0; i < a.length(); i++) {
                checkA[a.charAt(i) - 'a']++;
            }

            for (int i = 0; i < b.length(); i++) {
                int index = b.charAt(i) - 'a';

                if (checkA[index] > 0) {
                    checkA[index]--;
                } else {
                    checkB[index]++;
                }
            }

            int result = 0;
            for (int i = 0; i < 26; i++) {
                result += checkA[i];
                result += checkB[i];
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
