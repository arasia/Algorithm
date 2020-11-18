import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ListIterator;
import java.util.Vector;

/*
Acmicpc 2872

- 우리집엔 도서관이 있어 (https://www.acmicpc.net/problem/2872)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            Vector<Integer> vector = new Vector<>();

            for (int i = 0; i < N; i++) {
                vector.add(Integer.parseInt(br.readLine()));
            }

            int find = N;
            int result = 0;

            for (ListIterator<Integer> iter = vector.listIterator(vector.size()); iter.hasPrevious(); ) {
                if (iter.previous().equals(find)) {
                    find--;
                } else {
                    result++;
                }
            }

            bw.write(Integer.toString(result));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
