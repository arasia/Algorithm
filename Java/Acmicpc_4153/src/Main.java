import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 4153

- 직각삼각형 (https://www.acmicpc.net/problem/4153)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < 3; i++) {
                    list.add(Integer.parseInt(st.nextToken()));
                }
                if (list.get(0) == 0 && list.get(1) == 0 && list.get(2) == 0) {
                    break;
                }

                if (check(list)) {
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean check(List<Integer> list) {
        Collections.sort(list);
        return Math.pow(list.get(2), 2) == (Math.pow(list.get(0), 2) + Math.pow(list.get(1), 2));
    }
}
