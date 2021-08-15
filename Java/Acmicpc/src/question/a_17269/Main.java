package question.a_17269;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc 17269

- 이름궁합 테스트 (https://www.acmicpc.net/problem/17269)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            String A = st.nextToken(), B = st.nextToken();

            bw.write(matchChecker(listMaker(A, B)) + "%");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int matchChecker(List<Integer> list) {
        while (list.size() > 2) {
            for (int i = 0; i < list.size() - 1; i++) {
                list.set(i, (list.get(i) + list.get(i + 1)) % 10);
            }
            list.remove(list.size() - 1);
        }

        return (list.get(0) * 10) + list.get(1);
    }


    private static List<Integer> listMaker(String a, String b) {
        char[] listA = a.toCharArray();
        char[] listB = b.toCharArray();
        List<Integer> list = new ArrayList<>();

        int lengthA = listA.length, lengthB = listB.length;
        int length = Math.max(lengthA, lengthB);

        for (int i = 0; i < length; i++) {
            if (lengthA > i) {
                list.add(findValue(listA[i]));
            }

            if (lengthB > i) {
                list.add(findValue(listB[i]));
            }
        }

        return list;
    }

    private static Integer findValue(char c) {
        switch (c) {
            case 'C':
            case 'G':
            case 'I':
            case 'J':
            case 'L':
            case 'O':
            case 'S':
            case 'U':
            case 'V':
            case 'W':
            case 'Z':
                return 1;
            case 'B':
            case 'D':
            case 'N':
            case 'P':
            case 'Q':
            case 'R':
            case 'T':
            case 'X':
            case 'Y':
                return 2;
            case 'A':
            case 'F':
            case 'H':
            case 'K':
            case 'M':
                return 3;
            default:
                return 4;
        }
    }
}
