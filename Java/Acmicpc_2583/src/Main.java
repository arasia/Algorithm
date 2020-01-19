import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int[][] arr;
    static int M;
    static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        arr = new int[M][N];

        for(int i = 0 ; i < K ; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken())-1;
            int y2 = Integer.parseInt(st.nextToken())-1;

            for(int x = x1 ; x <= x2 ; x++) {
                for(int y = y1 ; y <= y2 ; y++) {
                    arr[y][x] = 1;
                }
            }
        }

        List<Integer> result = func();
        int count = result.get(0);
        result.remove(0);
        bw.write(count + "\n");
        bw.flush();

        Collections.sort(result);
        for (Integer integer : result) {
            bw.write(integer + " ");
            bw.flush();
        }

        br.close();
        bw.close();
    }

    public static List<Integer> func() {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        for(int x = 0 ; x < N ; x++) {
            for(int y = 0 ; y < M ; y++) {
                if(arr[y][x] == 0) {
                    result.set(0, result.get(0)+1);
                    result.add(func2(x, y));
                }
            }
        }
        return result;
    }

    public static int func2(int x, int y) {
        int result = 0;
        try {
            if(arr[y][x] == 0) {
                arr[y][x] = 1;
                return 1 + func2(x+1, y) + func2(x, y+1) + func2(x-1, y) + func2(x, y-1);
            } else {
                return 0;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            return 0;
        }
    }
}
