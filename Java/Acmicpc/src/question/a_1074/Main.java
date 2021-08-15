package question.a_1074;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1074

- Z (https://www.acmicpc.net/problem/1074)
*/
public class Main {
    static int r, c;
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());

            int len = (int) Math.pow(2, N);

            bw.write(Integer.toString(func(0, 0, len, 0)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int func(int x, int y, int len, int point) {
        if (len == 1) {
            return point;
        }

        int result;
        int currentLen = len / 2;
        switch (checker(x, y, currentLen)) {
            case 0:
                result = func(x, y, currentLen, point);
                break;
            case 1:
                result = func(x, y + currentLen, currentLen, point + (int) Math.pow(currentLen, 2));
                break;
            case 2:
                result = func(x + currentLen, y, currentLen, point + (int) Math.pow(currentLen, 2) * 2);
                break;
            default:
                result = func(x + currentLen, y + currentLen, currentLen, point + (int) Math.pow(currentLen, 2) * 3);
        }

        return result;
    }

    private static int checker(int x, int y, int len) {
        if(r < x + len && c < y + len)
            return 0;

        if(r < x + len && c >= y + len)
            return 1;

        if(r >= x + len && c < y + len)
            return 2;

        return 3;
    }
}
