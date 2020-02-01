import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/*
Acmicpc
- 셀프넘버 (https://www.acmicpc.net/problem/4673)
 */
public class Main {
    static int max = 10001;
    static boolean arr[];
    public static void main(String[] args) {
        arr = new boolean[max];
        Arrays.fill(arr, true);
        for(int i = 1 ; i < max ; i++) {
            int currentNum = i;
            int unSelfNum = currentNum;
            while(true) {
                if(currentNum>0) {
                    unSelfNum += currentNum % 10;
                    currentNum /= 10;
                } else {
                    break;
                }
            }
            if(unSelfNum < max) {
                arr[unSelfNum] = false;
            }
        }
        try(BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));) {
            for(int i = 1 ; i < max ; i++) {
                if(arr[i] == true) {
                    bw.write(i + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
