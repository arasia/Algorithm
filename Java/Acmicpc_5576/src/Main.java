import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Acmicpc 5576

- 콘테스트 (https://www.acmicpc.net/problem/5576)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<Integer> W = new ArrayList<>();
            List<Integer> K = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                W.add(Integer.parseInt(br.readLine()));
            }
            for (int i = 0; i < 10; i++) {
                K.add(Integer.parseInt(br.readLine()));
            }

            W.sort(Collections.reverseOrder());
            K.sort(Collections.reverseOrder());

            bw.write((W.get(0) + W.get(1) + W.get(2)) + " " + (K.get(0) + K.get(1) + K.get(2)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
