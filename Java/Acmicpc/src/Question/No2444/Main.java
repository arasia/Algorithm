package Question.No2444;

import java.io.*;
/*
Acmicpc
- 별찍기 - 7 (https://www.acmicpc.net/problem/2444)
- Java 11
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N-1 ; i++) {
            String lineResult = " ".repeat(N - i - 1) + "*".repeat(i * 2 + 1);
            bw.write(lineResult + "\n");
        }
        bw.write("*".repeat((N-1)*2 +1) + "\n");
        for(int i = N-2 ; i >= 0 ; i--) {
            String lineResult = " ".repeat(N - i - 1) + "*".repeat(i * 2 + 1);
            bw.write(lineResult + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
