package Question.No1244;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 스위치 켜고 끄기 (https://www.acmicpc.net/problem/1244)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            list.add(0);

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                st = new StringTokenizer(br.readLine());
                String sex = st.nextToken();
                int value = Integer.parseInt(st.nextToken());

                if (sex.equals("1")) {
                    int current = value;
                    while (current < list.size()) {
                        list.set(current, convert(list.get(current)));
                        current += value;
                    }
                } else {
                    list.set(value, convert(list.get(value)));

                    int start = value - 1;
                    int finish = value + 1;

                    while (start > 0 && finish < list.size()) {
                        if (list.get(start).equals(list.get(finish))) {
                            list.set(start, convert(list.get(start)));
                            list.set(finish, convert(list.get(finish)));
                            start--;
                            finish++;
                        } else {
                            break;
                        }
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < list.size(); i++) {
                sb.append(list.get(i)).append(" ");
                if ((i % 20) == 0) {
                    sb.append("\n");
                }
            }
            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int convert(int value) {
        return value == 0 ? 1 : 0;
    }
}
