import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;
import java.util.stream.Collectors;

/*
Acmicpc 18870

- 좌표 압축 (https://www.acmicpc.net/problem/18870)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> map = new HashMap<>();
            Set<Integer> set = new TreeSet<>();

            while (st.hasMoreTokens()) {
                int current = Integer.parseInt(st.nextToken());
                list.add(current);
                set.add(current);
            }

            List<Integer> sortedList = set.stream().sorted(Integer::compareTo).collect(Collectors.toList());

            for (int i = 0; i < sortedList.size(); i++) {
                map.put(sortedList.get(i), i);
            }

            StringBuilder sb = new StringBuilder();
            for (Integer integer : list) {
                sb.append(map.get(integer)).append(" ");
            }

            bw.write(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
