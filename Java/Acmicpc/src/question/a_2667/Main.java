package question.a_2667;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
단지번호 붙이기 (https://www.acmicpc.net/problem/2667)
 */
public class Main {

    static int N;
    static int[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];

        for(int i = 0 ; i < N ; i++) {
            String input = br.readLine();
            for(int j = 0 ; j < N ; j++) {
                arr[i][j] = (int)input.charAt(j) - 48;
            }
        }

        List<Integer> result = func();
        int count = result.get(0);
        result.remove(0);
        bw.write(count + "\n");

        Collections.sort(result);
        for (Integer integer : result) {
            bw.write(integer + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static List<Integer> func() {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for(int x = 0 ; x < N ; x++) {
            for(int y = 0 ; y < N ; y++) {
                if(arr[y][x] == 1) {
                    result.set(0, result.get(0)+1);
                    result.add(func2(x, y));
                }
            }
        }
        return result;
    }

    public static int func2(int x, int y) {
        try {
            if(arr[y][x] == 1) {
                arr[y][x] = 0;
                return 1 + func2(x+1, y) + func2(x, y+1) + func2(x-1, y) + func2(x, y-1);
            } else {
                return 0;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
