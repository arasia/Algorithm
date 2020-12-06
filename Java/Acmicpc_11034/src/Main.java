import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 11034

- 캥거루 세마리2 (https://www.acmicpc.net/problem/11034)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String input;
            while ((input = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(input);
                List<Integer> list = new ArrayList<>();

                while (st.hasMoreTokens()) {
                    list.add(Integer.parseInt(st.nextToken()));
                }

                list.sort(Integer::compareTo);

                bw.write((Math.max(list.get(2) - list.get(1), list.get(1) - list.get(0)) - 1) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
