package Question.No10988;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = br.readLine();
        String reverse = new StringBuffer(input).reverse().toString();
        int result = input.compareTo(reverse);

        bw.write(result == 0 ? "1" : "0");
        br.close();
        bw.flush();
        bw.close();
    }
}
