package question.a_1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

/*
Acmicpc 1406

- 에디터 (https://www.acmicpc.net/problem/1406)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            String str = br.readLine();
            List<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();

            {
                int len = str.length();
                for (int i = 0; i < len; i++) {
                    iter.add(str.charAt(i));
                }
            }

            int N = Integer.parseInt(br.readLine());
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                switch (st.nextToken()) {
                    case "L":
                        if (iter.hasPrevious()) {
                            iter.previous();
                        }
                        break;
                    case "D":
                        if (iter.hasNext()) {
                            iter.next();
                        }
                        break;
                    case "B":
                        if (iter.hasPrevious()) {
                            iter.previous();
                            iter.remove();
                        }
                        break;
                    case "P":
                        iter.add(st.nextToken().charAt(0));
                }
            }

            for (Character character : list) {
                bw.write(String.valueOf(character));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
