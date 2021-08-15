package Question.No10469;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc 10469

- 사이 나쁜 여왕들 (https://www.acmicpc.net/problem/10469)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<Point> list = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                String line = br.readLine();

                for (int j = 0; j < 8; j++) {
                    if (line.charAt(j) == '*') {
                        list.add(new Point(i, j));
                    }
                }
            }

            if ((list.size() == 8) && func1(list)) {
                bw.write("valid");
            } else {
                bw.write("invalid");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean func1(List<Point> list) {
        for (Point point : list) {
            for (Point point1 : list) {
                if ((point != point1) && func2(point, point1)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean func2(Point point, Point point1) {
        if ((point.x == point1.x) || (point.y == point1.y)) {
            return true;
        }

        return Math.abs((point.x - point1.x) / (point.y - point1.y)) == 1.0;
    }

    static class Point{
        double x;
        double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
