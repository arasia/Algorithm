import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 9324

- 진짜 메세지 (https://www.acmicpc.net/problem/9324)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());

            while (T-- > 0) {
                if (checker(br.readLine())) {
                    bw.write("OK\n");
                } else {
                    bw.write("FAKE\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checker(String input) {
        char[] chars = input.toCharArray();
        int[] arr = new int[26];

        for (int i = 0; i < chars.length; i++) {
            int current = chars[i] - 'A';
            arr[current]++;

            if ((arr[current] != 0) && (arr[current] % 3 == 0)) {
                if (((i + 1) < chars.length) && (current == (chars[i + 1] - 'A'))) {
                    i++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
