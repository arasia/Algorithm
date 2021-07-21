import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

/*
Acmicpc 17219

- 비밀번호 찾기 (https://www.acmicpc.net/problem/17219)
*/
public class Main {
    public static void main(String[] args) {
        try (
                var br = new BufferedReader(new InputStreamReader(System.in));
                var bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String[] strings = br.readLine().split(" ");
            var N = Integer.parseInt(strings[0]);
            var M = Integer.parseInt(strings[1]);

            Map<String, String> map = new HashMap<>();
            while (N-- > 0) {
                strings = br.readLine().split(" ");
                map.put(strings[0], strings[1]);
            }

            while (M-- > 0) {
                bw.write(map.get(br.readLine()) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
