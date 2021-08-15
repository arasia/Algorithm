package question.a_5397;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/*
Acmicpc 5397

- 키로거 (https://www.acmicpc.net/problem/5397)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int T = Integer.parseInt(br.readLine());
            while (T-- > 0) {
                List<Character> list = new LinkedList<>();
                String input = br.readLine();
                int length = input.length();

                ListIterator<Character> iterator = list.listIterator();

                for (int i = 0; i < length; i++) {
                    char ch = input.charAt(i);

                    switch (ch) {
                        case '<':
                            if (iterator.hasPrevious()) {
                                iterator.previous();
                            }
                            break;
                        case '>':
                            if (iterator.hasNext()) {
                                iterator.next();
                            }
                            break;
                        case '-':
                            if (iterator.hasPrevious()) {
                                iterator.previous();
                                iterator.remove();
                            }
                            break;
                        default:
                            iterator.add(ch);
                    }
                }

                for (Character character : list) {
                    bw.write(String.valueOf(character));
                }
                bw.write("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
