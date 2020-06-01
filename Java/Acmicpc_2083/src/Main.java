import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2083

- 럭비 클럽 (https://www.acmicpc.net/problem/2083)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();

                if (name.equals("#")) {
                    break;
                }

                if (Integer.parseInt(st.nextToken()) > 17 || Integer.parseInt(st.nextToken()) >= 80) {
                    bw.write(name + " Senior\n");
                } else {
                    bw.write(name + " Junior\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
