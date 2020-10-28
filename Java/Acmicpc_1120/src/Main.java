import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1120

- 문자열 (https://www.acmicpc.net/problem/1120)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String A = st.nextToken(), B = st.nextToken();
            if (A.length() < B.length()) {
                bw.write(Integer.toString(func(A, B)));
            } else {
                bw.write(Integer.toString(func(B, A)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int func(String A, String B) {
        int result = 51, diff = B.length() - A.length();

        for (int i = 0; i <= diff; i++) {
            int current = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j+i)) {
                    current++;
                }
            }

            result = Math.min(current, result);
        }

        return result;
    }
}
