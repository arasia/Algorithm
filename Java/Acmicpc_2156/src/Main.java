import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int wineCnt = Integer.parseInt(br.readLine());
        int[] maxWine = new int[wineCnt+1];
        List<Integer> wines = new ArrayList<>();
        int result;

        wines.add(0);
        for(int i = 0 ; i < wineCnt ; i++) {
            wines.add(Integer.parseInt(br.readLine()));
        }

        maxWine[1] = wines.get(1);
        result = maxWine[1];

        if(wineCnt > 1) {
            maxWine[2] = maxWine[1] + wines.get(2);
            result = maxWine[2];

            if(wineCnt > 2) {
                maxWine[3] = Math.max(maxWine[1] + wines.get(3), maxWine[0] + wines.get(2) + wines.get(3));
            }

            for(int i = 4 ; i <= wineCnt ; i++) {
                maxWine[i] = Math.max(Math.max(maxWine[i-2] + wines.get(i), maxWine[i-3] + wines.get(i-1) + wines.get(i)), maxWine[i-4] + wines.get(i-1) + wines.get(i));
                result = Math.max(result, maxWine[i]);
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
