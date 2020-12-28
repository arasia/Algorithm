import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

/*
Acmicpc 5361

- 전투 드로이드 가격 (https://www.acmicpc.net/problem/5361)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            DecimalFormat format = new DecimalFormat("0.00");

            while (T-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                double result = 0;

                result += 350.34 * Integer.parseInt(st.nextToken());
                result += 230.90 * Integer.parseInt(st.nextToken());
                result += 190.55 * Integer.parseInt(st.nextToken());
                result += 125.30 * Integer.parseInt(st.nextToken());
                result += 180.90 * Integer.parseInt(st.nextToken());

                bw.write("$" + format.format(result) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
