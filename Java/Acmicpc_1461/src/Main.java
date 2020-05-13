import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 1461

- 도서관 (https://www.acmicpc.net/problem/1461)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            List<Integer> pList = new LinkedList<>();
            List<Integer> nList = new LinkedList<>();

            st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                if (current > 0) {
                    pList.add(current);
                } else {
                    nList.add(current * -1);
                }
            }

            pList.sort(Comparator.reverseOrder());
            nList.sort(Comparator.reverseOrder());

            int result = 0;
            int firstA = -1;
            int firstB = -1;

            int count = 0;
            boolean check = false;

            for (Integer integer : pList) {
                if (count % M == 0) {
                    result += integer * 2;
                    if (!check) {
                        firstA = integer;
                        check = true;
                    }
                }
                count++;
            }

            count = 0;
            check = false;
            for (Integer integer : nList) {
                if (count % M == 0) {
                    result += integer * 2;
                    if (!check) {
                        firstB = integer;
                        check = true;
                    }
                }
                count++;
            }

            bw.write(String.valueOf(result - Math.max(firstA, firstB)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
