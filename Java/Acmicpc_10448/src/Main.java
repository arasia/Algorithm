import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 10448

- 유레카 이론 (https://www.acmicpc.net/problem/10448)
*/
public class Main {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int ti = 1;
            int n = 2;
            while (ti <= 1000) {
                list.add(ti);
                ti += n;
                n++;
            }

            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                int check = Integer.parseInt(br.readLine());

                bw.write(func(check)? "1\n" : "0\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean func(int check) {
        for (Integer integer1 : list) {
            if (integer1 >= check) {
                break;
            }

            for (Integer integer2 : list) {
                if ((integer1 + integer2) >= check) {
                    break;
                }

                for (Integer integer3 : list) {
                    int sum = integer1 + integer2 + integer3;

                    if (sum == check) {
                        return true;
                    }

                    if (sum > check) {
                        break;
                    }
                }
            }
        }

        return false;
    }
}
