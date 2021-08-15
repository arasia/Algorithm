package Question.No1302;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
Acmicpc 1302

- 베스트셀러 (https://www.acmicpc.net/problem/1302)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            Map<String, Integer> map = new HashMap<>();
            int count = Integer.parseInt(br.readLine());

            while (count-- > 0) {
                String input = br.readLine();
                map.put(input, map.getOrDefault(input, 0) + 1);
            }

            List<Sales> salesList = map.entrySet()
                    .stream()
                    .map(makeSalesFromEntry())
                    .sorted(reverseSortCountThanSortBookName())
                    .collect(Collectors.toList());

            bw.write(salesList.get(0).bookName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Function<Map.Entry<String, Integer>, Sales> makeSalesFromEntry() {
        return entry -> new Sales(entry.getKey(), entry.getValue());
    }

    private static Comparator<Sales> reverseSortCountThanSortBookName() {
        return Comparator.comparing(Sales::getCount, Comparator.reverseOrder())
                .thenComparing(Sales::getBookName);
    }

    static class Sales {
        private final String bookName;
        private final Integer count;

        public Sales(String bookName, Integer count) {
            this.bookName = bookName;
            this.count = count;
        }

        public String getBookName() {
            return bookName;
        }

        public Integer getCount() {
            return count;
        }
    }
}
