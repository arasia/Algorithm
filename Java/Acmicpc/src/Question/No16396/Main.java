package Question.No16396;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 16396

- 선 그리기 (https://www.acmicpc.net/problem/16396)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            List<Line> lines = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                lines.add(new Line(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            Collections.sort(lines);

            List<Line> resultLines = new ArrayList<>();
            Line pre = lines.get(0);
            for (int i = 1; i < N; i++) {
                Line current = lines.get(i);

                if (pre.finish >= current.start) {
                    pre.finish = Math.max(pre.finish, current.finish);
                } else {
                    resultLines.add(pre);
                    pre = current;
                }
            }
            resultLines.add(pre);

            int result = 0;
            for (Line resultLine : resultLines) {
                result += (resultLine.finish - resultLine.start);
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static class Line implements Comparable<Line>{
        int start;
        int finish;

        public Line(int start, int finish) {
            this.start = start;
            this.finish = finish;
        }

        @Override
        public int compareTo(Line line) {
            return Integer.compare(start, line.start);
        }
    }
}
