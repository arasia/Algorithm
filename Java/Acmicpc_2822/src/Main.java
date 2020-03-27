import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Acmicpc
- 점수 계산 (https://www.acmicpc.net/problem/2822)
 */
public class Main {

    public static class Point implements Comparable<Point> {
        private int index;
        private int point;

        public Point(int index, int point) {
            this.index = index;
            this.point = point;
        }

        @Override
        public int compareTo(Point point) {
            return Integer.compare(point.point, this.point);
        }
    }


    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<Point> pointList = new ArrayList<>();
            for (int i = 1; i <= 8; i++) {
                pointList.add(new Point(i, Integer.parseInt(br.readLine())));
            }

            Collections.sort(pointList);

            List<Integer> indexList = new ArrayList<>();
            int result = 0;

            for (int i = 0; i < 5; i++) {
                indexList.add(pointList.get(i).index);
                result += pointList.get(i).point;
            }

            Collections.sort(indexList);

            bw.write(result + "\n");

            for (Integer integer : indexList) {
                bw.write(integer + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
