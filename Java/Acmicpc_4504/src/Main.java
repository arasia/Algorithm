import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
Acmicpc 4504

- 배수 찾기 (https://www.acmicpc.net/problem/4504)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int n = Integer.parseInt(br.readLine());

            while (true) {
                int current = Integer.parseInt(br.readLine());

                if (current == 0) {
                    break;
                }

                bw.write(current + " is ");
                if (current % n != 0) {
                    bw.write("NOT ");
                }
                bw.write("a multiple of " +  n + ".\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
