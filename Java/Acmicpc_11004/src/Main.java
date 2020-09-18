import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 11004

- K번째 수 (https://www.acmicpc.net/problem/11004)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list);

            System.out.println(list.get(K-1));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
