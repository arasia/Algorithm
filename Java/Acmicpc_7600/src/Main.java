import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

/*
Acmicpc 7600

- 문자가 몇갤까 (https://www.acmicpc.net/problem/7600)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                String inputLine = br.readLine();

                if (inputLine.equals("#")) {
                    break;
                }

                bw.write(solution(inputLine) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solution(String inputLine) {
        Set<Character> set = new HashSet<>();

        for (char c : inputLine.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                set.add(Character.toLowerCase(c));
            }
        }

        return set.size();
    }
}
