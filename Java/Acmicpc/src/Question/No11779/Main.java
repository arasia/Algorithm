package Question.No11779;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

/*
Acmicpc 11779

- 최소비용 구하기 2 (https://www.acmicpc.net/problem/11779)
*/
public class Main {
    static int n;
    static int m;
    static int start;
    static int dist;
    static Map<Integer, Result> result = new HashMap<>();
    static List<List<Path>> list = new ArrayList<>();

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i <= n; i++) {
                list.add(new ArrayList<>());
                result.put(i, new Result(0, 0, ""));
            }

            m = Integer.parseInt(br.readLine());
            for (int i = 0; i < m; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                list.get(Integer.parseInt(st.nextToken())).add(new Path(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
            }

            {
                StringTokenizer st = new StringTokenizer(br.readLine());
                start = Integer.parseInt(st.nextToken());
                dist = Integer.parseInt(st.nextToken());
            }

            Result result = new Result();
            result.setCost(0);
            result.setCount(0);
            result.setPath("");
            func(start, result);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void func(int current, Result currentResult) {
        for (Path path : list.get(current)) {
            if ((currentResult.getCost() + path.cost) < result.get(path.dist).getCost()) {
                Result r = new Result();


            }


        }

    }

    public static class Result {
        private int cost;
        private int count;
        private String path;

        public Result() {
        }

        public Result(int cost, int count, String path) {
            this.cost = cost;
            this.count = count;
            this.path = path;
        }

        public int getCost() {
            return cost;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }
    }

    public static class Path {
        private final int dist;
        private final int cost;

        public Path(int dist, int cost) {
            this.dist = dist;
            this.cost = cost;
        }

        public int getDist() {
            return dist;
        }

        public int getCost() {
            return cost;
        }
    }

}
