package Question.No2565;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc
- 전깃줄 (https://www.acmicpc.net/problem/2565)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Line> lineList = new ArrayList<>();
            int[] unCrossedCount = new int[N + 1];

            lineList.add(new Line(-1, -1));
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                lineList.add(new Line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            Collections.sort(lineList);

            unCrossedCount[1] = 1;

            for (int i = 2; i <= N; i++) {
                unCrossedCount[i] = 1;
                for (int j = 1; j < i; j++) {
                    if(lineList.get(i).getDest() > lineList.get(j).getDest()) {
                        unCrossedCount[i] = Math.max(unCrossedCount[i], unCrossedCount[j]+1);
                    }
                }
            }

            Arrays.sort(unCrossedCount);

            bw.write(String.valueOf(N - unCrossedCount[N]));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Line implements Comparable<Line> {
        private int start;
        private int dest;

        public Line(int start, int dest) {
            this.start = start;
            this.dest = dest;
        }

        public int getStart() {
            return start;
        }

        public int getDest() {
            return dest;
        }

        @Override
        public int compareTo(Line line) {
            return Integer.compare(this.start, line.getStart());
        }
    }
}
