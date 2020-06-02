import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

/*
Acmicpc 6679

- 싱기한 네자리 숫자 (https://www.acmicpc.net/problem/6679)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            for (int i = 1000; i < 10000; i++) {
                if (compare(i)) {
                    bw.write(i + "\n");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean compare(int n) {
        int ten = func10(n);
        return ten == func12(n) && ten == func16(n);
    }

    public static int func10(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }

    public static int func12(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 12;
            n /= 12;
        }
        return result;
    }

    public static int func16(int n) {
        int result = 0;
        while (n > 0) {
            result += n % 16;
            n /= 16;
        }
        return result;
    }
}
