import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 주차의 신 (https://www.acmicpc.net/problem/5054)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int t = Integer.parseInt(br.readLine());

            while (t-- > 0) {
                int n = Integer.parseInt(br.readLine());
                StringTokenizer st = new StringTokenizer(br.readLine());
                List<Integer> list = new ArrayList<>();

                while (st.hasMoreTokens()) {
                    list.add(Integer.parseInt(st.nextToken()));
                }

                Collections.sort(list);

                int result = 2 * Math.abs(list.get(0) - list.get(list.size()-1));
                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
