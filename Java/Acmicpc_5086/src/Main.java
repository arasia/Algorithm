import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 5086

- 배수와 약수 (https://www.acmicpc.net/problem/5086)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (a == 0 && b == 0) {
                    break;
                }

                if (a % b == 0) {
                    bw.write("multiple\n");
                } else if (b % a == 0) {
                    bw.write("factor\n");
                } else {
                    bw.write("neither\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
