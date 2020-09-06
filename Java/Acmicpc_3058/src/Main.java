import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.StringTokenizer;

/*
Acmicpc 3058

- 짝수를 찾아라 (https://www.acmicpc.net/problem/3058)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int K = Integer.parseInt(br.readLine());

            for (int i = 1; i <= K; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                List<Integer> list = new ArrayList<>();
                OptionalInt min;
                int sum = 0;

                while (st.hasMoreTokens()) {
                    list.add(Integer.parseInt(st.nextToken()));
                }

                sum = list.stream().mapToInt(Integer::intValue).filter(i1 -> i1 % 2 == 0).sum();
                min = list.stream().mapToInt(Integer::intValue).filter(i1 -> i1 % 2 == 0).min();

                if(min.isPresent())
                    bw.write(sum + " " + min.getAsInt() + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
