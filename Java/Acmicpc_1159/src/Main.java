import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 1159

- 농구 경기 (https://www.acmicpc.net/problem/1159)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[26];
            while (N-- > 0) {
                arr[br.readLine().charAt(0) - 'a']++;
            }

            int count = 0;
            for (int i = 0; i < 26; i++) {
                if (arr[i] > 4) {
                    bw.write((char)('a' + i));
                    count++;
                }
            }

            if (count == 0) {
                bw.write("PREDAJA");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
