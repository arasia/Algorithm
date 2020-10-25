import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 2684

- 동전 게임 (https://www.acmicpc.net/problem/2684)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            while (N-- > 0) {
                int[] arr = new int[8];
                StringBuilder sb = new StringBuilder();
                String input = br.readLine();
                input = input.replace('H', '1').replace('T', '0');

                for (int i = 0; i < 38; i++) {
                    arr[Integer.parseInt(input.substring(i, i+3), 2)]++;
                }

                for (int i : arr) {
                    sb.append(i).append(" ");
                }

                bw.write(sb.toString().trim() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
