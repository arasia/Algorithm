import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/*
Acmicpc 9933

- 민균이의 비밀번호 (https://www.acmicpc.net/problem/9933)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            String result = null;

            for (int i = 0; i < N; i++) {
                String input = br.readLine();

                if (map.containsKey(input)) {
                    result = input;
                    break;
                }
                map.put(input, 1);

                input = new StringBuilder(input).reverse().toString();

                if (map.containsKey(input)) {
                    result = input;
                    break;
                }
                map.put(input, 1);
            }

            assert result != null;
            bw.write(result.length() + " " + result.charAt(result.length() / 2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
