package Question.No6603;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 6603

- 로또 (https://www.acmicpc.net/problem/6603)
 */
public class Main {
    public static List<Integer> list;
    public static boolean[] check;
    public static int N;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                N = Integer.parseInt(st.nextToken());

                if (N == 0) {
                    break;
                }

                list = new ArrayList<>();
                check = new boolean[N];

                for (int i = 0; i < N; i++) {
                    list.add(Integer.parseInt(st.nextToken()));
                }

                Collections.sort(list);

                func(0, 0, "");

                sb.append("\n");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void func(int current, int depth, String string) {
        if(depth == 6) {
            sb.append(string).append("\n");
        } else {
            for (int i = current; i < N; i++) {
                if (!check[i]) {
                    check[i] = true;
                    func(i, depth + 1, string + list.get(i) + " ");
                    check[i] = false;
                }
            }
        }
    }
}
