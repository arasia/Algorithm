import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 4641

- Doubles (https://www.acmicpc.net/problem/4641)
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
                boolean finish = false;

                while (st.hasMoreTokens()) {
                    int temp = Integer.parseInt(st.nextToken());

                    if (temp == -1) {
                        finish = true;
                        break;
                    }

                    if (temp == 0) {
                        break;
                    }

                    list.add(temp);
                }

                if (finish) {
                    break;
                }

                int result = 0;
                for (Integer integer : list) {
                    if (list.contains(integer * 2)) {
                        result++;
                    }
                }

                bw.write(result + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
