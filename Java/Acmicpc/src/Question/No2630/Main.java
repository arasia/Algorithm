package Question.No2630;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc
- 색종이 만들기 (https://www.acmicpc.net/problem/2630)
 */
public class Main {
    private static int[][] paper;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            paper = new int[N+1][N+1];
            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 1; j <= N ; j++) {
                    paper[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            Count result = paperCounter(1, N, 1, N, N);
            bw.write(result.getWhitePaper() + "\n" + result.getBluePaper());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Count paperCounter(int start_x, int finish_x, int start_y, int finish_y, int width) {
        Count result = new Count(0, 0);
        if((start_x > finish_x) || (start_y > finish_y)) {
            return result;
        }

        boolean paperIsWhite = (paper[start_x][start_y] == 0);
        int totalCell = width * width;
        int countCell = 0;

        for (int i = start_x; i <= finish_x ; i++) {
            for (int j = start_y; j <= finish_y ; j++) {

                if((paper[i][j] == 1) && (!paperIsWhite)) {
                    countCell++;
                } else if((paper[i][j] == 0) && (paperIsWhite)){
                    countCell++;
                } else {
                    break;
                }
            }
        }

        if (totalCell == countCell) {
            if(paperIsWhite) {
                result.setWhitePaper(result.getWhitePaper() + 1);
            } else {
                result.setBluePaper(result.getBluePaper() + 1);
            }
        } else {
            width /= 2;
            result.add(paperCounter(start_x, finish_x - width, start_y, finish_y - width, width));
            result.add(paperCounter(start_x + width, finish_x, start_y, finish_y - width, width));
            result.add(paperCounter(start_x, finish_x - width, start_y + width, finish_y, width));
            result.add(paperCounter(start_x + width, finish_x, start_y + width, finish_y, width));
        }

        return result;
    }

    private static class Count {
        private int whitePaper;
        private int bluePaper;

        public Count(int whitePaper, int bluePaper) {
            this.whitePaper = whitePaper;
            this.bluePaper = bluePaper;
        }

        public void add(Count count) {
            this.whitePaper += count.whitePaper;
            this.bluePaper += count.bluePaper;
        }

        public int getWhitePaper() {
            return whitePaper;
        }

        public void setWhitePaper(int whitePaper) {
            this.whitePaper = whitePaper;
        }

        public int getBluePaper() {
            return bluePaper;
        }

        public void setBluePaper(int bluePaper) {
            this.bluePaper = bluePaper;
        }
    }
}
