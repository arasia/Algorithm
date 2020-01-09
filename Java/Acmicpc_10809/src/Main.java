import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] array = new int[26];
        Arrays.fill(array, -1);

        String input;
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            input = br.readLine().trim();
        } catch (Exception e) {
            return;
        }
        
        for(int i = 0 ; i < input.length() ; i++) {
            int index = (int)input.charAt(i)-97;
            if(array[index] == -1) {
                array[(int) input.charAt(i) - 97] = i;
            }
        }

        for (int i = 0 ; i < array.length ; i++) {
            if(i == 0) {
                System.out.print(array[i]);
            } else {
                System.out.print(" " + array[i]);
            }
        }
    }
}
