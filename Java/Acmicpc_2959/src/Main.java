import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 2959

- 거북이 (https://www.acmicpc.net/problem/2959)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();

            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(list);

            bw.write(String.valueOf(list.get(0) * list.get(2)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
