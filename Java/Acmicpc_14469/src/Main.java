import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Acmicpc 14469

- 소가 길을 건너간 이유 3 (https://www.acmicpc.net/problem/14469)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Cow> cowList = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                cowList.add(new Cow(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
            }

            Collections.sort(cowList);

            int resultTime = 0;
            for (Cow cow : cowList) {
                if (cow.start > resultTime) {
                    resultTime = cow.start + cow.time;
                } else {
                    resultTime += cow.time;
                }
            }

            bw.write(Integer.toString(resultTime));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static class Cow implements Comparable<Cow>{
        int start;
        int time;

        public Cow(int start, int time) {
            this.start = start;
            this.time = time;
        }

        @Override
        public int compareTo(Cow o) {
            return Integer.compare(this.start, o.start);
        }
    }
}
