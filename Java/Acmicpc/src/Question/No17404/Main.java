package Question.No17404;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int minCost[][] = new int[N+1][3];
        int costByHouse[][] = new int[N+1][3];
        int result = 1000001;

        for(int i = 1 ; i <= N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            costByHouse[i][0] = Integer.parseInt(st.nextToken());
            costByHouse[i][1] = Integer.parseInt(st.nextToken());
            costByHouse[i][2] = Integer.parseInt(st.nextToken());
        }

        for(int startColor = 0  ; startColor < 3 ; startColor++) {
            for(int i = 0 ; i < 3 ; i++) {
                minCost[1][i] = ((i == startColor) ? costByHouse[1][i] : 1000001);
            }

            for(int i = 2 ; i <= N ; i++) {
                minCost[i][0] = costByHouse[i][0] + Math.min(minCost[i-1][1], minCost[i-1][2]);
                minCost[i][1] = costByHouse[i][1] + Math.min(minCost[i-1][0], minCost[i-1][2]);
                minCost[i][2] = costByHouse[i][2] + Math.min(minCost[i-1][0], minCost[i-1][1]);
            }

            for(int i = 0 ; i < 3 ; i++) {
                result = (i == startColor ? result : Math.min(result, minCost[N][i]));
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}
