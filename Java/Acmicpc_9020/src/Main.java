import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
Acmicpc 9020

- 골드바흐의 추측 (https://www.acmicpc.net/problem/9020)
*/
public class Main {
    static boolean[] primeNum = new boolean[10001];
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            InitPrimeNum();

            int t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
                goldbachConjecture(Integer.parseInt(br.readLine()));
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void goldbachConjecture(int n) {
        int a, b;
        a = b = n/2;

        while (true) {
            if (primeNum[a] && primeNum[b]) {
                sb.append(a).append(" ").append(b).append("\n");
                return;
            }

            a--;
            b++;
        }
    }

    private static void InitPrimeNum() {
        Arrays.fill(primeNum, true);
        primeNum[0] = primeNum[1] = false;

        for (int i = 2; i <= 100 ; i++)
            if(primeNum[i])
                for (int j = i * i; j <= 10000; j += i)
                    primeNum[j] = false;
    }
}
