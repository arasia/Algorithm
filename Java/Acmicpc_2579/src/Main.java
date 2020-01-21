import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int stairsCnt = Integer.parseInt(br.readLine());
        int[] result = new int[stairsCnt+1];
        List<Integer> stairs = new ArrayList<>();

        stairs.add(0);
        for(int i = 0 ; i < stairsCnt ; i++) {
            stairs.add(Integer.parseInt(br.readLine()));
        }

        result[1] = stairs.get(1);
        if(stairsCnt >= 2) {
            result[2] = result[1] + stairs.get(2);
        }

        for(int i = 3 ; i <= stairsCnt ; i++) {
            result[i] = Math.max(result[i-2] + stairs.get(i), result[i-3] + stairs.get(i-1) + stairs.get(i));
        }

        bw.write(String.valueOf(result[stairsCnt]));
        bw.flush();
        bw.close();
        br.close();
    }
}
