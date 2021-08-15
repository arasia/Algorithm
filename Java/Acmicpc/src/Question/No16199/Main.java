package Question.No16199;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 16199

- 나이 계산하기 (https://www.acmicpc.net/problem/16199)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int yearB = Integer.parseInt(st.nextToken());
            int monthB = Integer.parseInt(st.nextToken());
            int dayB = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int yearC = Integer.parseInt(st.nextToken());
            int monthC = Integer.parseInt(st.nextToken());
            int dayC = Integer.parseInt(st.nextToken());

            if (yearC == yearB) {
                bw.write("0\n");
            } else {
                if (monthC > monthB) {
                    bw.write((yearC - yearB) + "\n");
                } else if ((monthC == monthB) && (dayC >= dayB)) {
                    bw.write((yearC - yearB) + "\n");
                } else {
                    bw.write((yearC - yearB - 1) + "\n");
                }
            }

            bw.write((yearC - yearB + 1) + "\n");
            bw.write((yearC - yearB) + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
