import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

/*
Acmicpc 1271

- 엄청난 부자2 (https://www.acmicpc.net/problem/1271)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger m = new BigInteger(st.nextToken());
            BigInteger n = new BigInteger(st.nextToken());
            BigInteger[] result = m.divideAndRemainder(n);

            bw.write(result[0] + "\n" + result[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
