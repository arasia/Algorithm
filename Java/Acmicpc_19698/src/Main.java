import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 19698

- 헛간 청약 (https://www.acmicpc.net/problem/19698)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            int L = Integer.parseInt(st.nextToken());

            bw.write(Integer.toString(Math.min((W / L) * (H / L), N)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
