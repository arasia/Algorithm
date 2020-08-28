import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 2857

- FBI (https://www.acmicpc.net/problem/2857)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = 0;
            boolean check = true;

            while (N++ < 5) {
                if (br.readLine().contains("FBI")) {
                    check = false;
                    bw.write(N + " ");
                }
            }

            if (check) {
                bw.write("HE GOT AWAY!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
