package Question.No2346;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 2346

- 풍선 터트리기 (https://www.acmicpc.net/problem/2346)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Data> list = new LinkedList<>();

            int i = 1;
            while (st.hasMoreTokens()) {
                list.add(new Data(i++, Integer.parseInt(st.nextToken())));
            }

            int index = 0;
            while (true) {
                bw.write(list.get(index).getIndex() + " ");
                int move = list.get(index).getValue();
                list.remove(index);

                if (list.isEmpty()) {
                    break;
                }

                if (move > 0) {
                    index = (index + move - 1) % list.size();
                } else {
                    index = index + move;

                    if (index < 0) {
                        index = (list.size() - (Math.abs(index) % list.size())) % list.size();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Data {
        private final int index;
        private final int value;

        public Data(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public int getIndex() {
            return index;
        }

        public int getValue() {
            return value;
        }
    }

}
