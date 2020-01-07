import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int K, N;
        K = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        int Lan[] = new int[K];
        for(int i = 0 ; i < K ; i++) {
            Lan[i] = Integer.parseInt(br.readLine().trim());
        }
        Arrays.sort(Lan);

        long left = 1 , right = Lan[K - 1];
        long result;

        while(left <= right) {
            long mid = (left + right) / 2;
            result = 0;
            for (int i : Lan) {
                result += i / mid;
            }
            if(result >= N) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(right);
    }
}
