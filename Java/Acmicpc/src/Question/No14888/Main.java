package Question.No14888;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 14888

- 연산자 끼워넣기 (https://www.acmicpc.net/problem/14888)
*/
public class Main {
    static int N;
    static List<Integer> list = new LinkedList<>();
    static Map<Character, Integer> op = new HashMap<>();
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            N = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
            st = new StringTokenizer(br.readLine());
            op.put('+', Integer.parseInt(st.nextToken()));
            op.put('-', Integer.parseInt(st.nextToken()));
            op.put('*', Integer.parseInt(st.nextToken()));
            op.put('/', Integer.parseInt(st.nextToken()));

            dfs(1, list.get(0));

            bw.write(max + "\n" + min);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void dfs(int i, Integer result) {
        if (i == N) {
            min = Math.min(min, result);
            max = Math.max(max, result);
            return;
        }

        if (op.get('+') > 0) {
            op.put('+', op.get('+') - 1);
            dfs(i + 1, result + list.get(i));
            op.put('+', op.get('+') + 1);
        }

        if (op.get('-') > 0) {
            op.put('-', op.get('-') - 1);
            dfs(i + 1, result - list.get(i));
            op.put('-', op.get('-') + 1);
        }

        if (op.get('*') > 0) {
            op.put('*', op.get('*') - 1);
            dfs(i + 1, result * list.get(i));
            op.put('*', op.get('*') + 1);
        }

        if (op.get('/') > 0) {
            op.put('/', op.get('/') - 1);
            dfs(i + 1, result / list.get(i));
            op.put('/', op.get('/') + 1);
        }
    }
}
