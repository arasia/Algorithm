import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 5524

- 입실 관리 (https://www.acmicpc.net/problem/5524)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());

            while (N-- > 0) {
                bw.write(br.readLine().toLowerCase() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
