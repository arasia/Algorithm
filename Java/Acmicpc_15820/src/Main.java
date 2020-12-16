import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 15820

- 맞았는데 왜 틀리죠? (https://www.acmicpc.net/problem/15820)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s1 = Integer.parseInt(st.nextToken()), s2 = Integer.parseInt(st.nextToken());
            boolean f1 = true, f2 = true;

            while (s1-- > 0) {
                st = new StringTokenizer(br.readLine());
                if (Integer.parseInt(st.nextToken()) != Integer.parseInt(st.nextToken())) {
                    f1 = false;
                }
            }

            while (s2-- > 0) {
                st = new StringTokenizer(br.readLine());
                if (Integer.parseInt(st.nextToken()) != Integer.parseInt(st.nextToken())) {
                    f2 = false;
                }
            }

            if (!f1) {
                bw.write("Wrong Answer");
            } else if (!f2) {
                bw.write("Why Wrong!!!");
            } else {
                bw.write("Accepted");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
