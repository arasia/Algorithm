import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 3040

- 백설 공주와 일곱 난쟁이 (https://www.acmicpc.net/problem/3040)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<Integer> list = new ArrayList<>();
            int sum = 0;
            for (int i = 0; i < 9; i++) {
                int current = Integer.parseInt(br.readLine());
                sum += current;
                list.add(current);
            }

            func(list, sum);

            for (Integer integer : list) {
                bw.write(integer + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void func(List<Integer> list, int sum) {
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                Integer a = list.get(i);
                Integer b = list.get(j);
                if (sum - a - b == 100) {
                    list.remove(a);
                    list.remove(b);
                    return;
                }
            }
        }
    }
}
