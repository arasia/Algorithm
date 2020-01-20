import java.io.*;
import java.util.*;

public class Main {

    public static Map<Integer, List<Integer>> listMap = new HashMap<>();
    public static Map<Integer, Boolean> dfsPointList = new HashMap<>();
    public static Map<Integer, Boolean> bfsPointList = new HashMap<>();
    public static List<Integer> dfsList = new ArrayList<>();
    public static List<Integer> bfsList = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        for(int i = 0 ; i < M ; i++) {
            st = new StringTokenizer(br.readLine());
            int point1 = Integer.parseInt(st.nextToken());
            int point2 = Integer.parseInt(st.nextToken());
            addPoint(point1, point2);
            addPoint(point2, point1);
        }

        sort();
        dfs(V);
        bfs(V);

        StringBuilder dfsResult = new StringBuilder();
        StringBuilder bfsResult = new StringBuilder();

        for (Integer integer : dfsList) {
            dfsResult.append(integer).append(" ");
        }
        for (Integer integer : bfsList) {
            bfsResult.append(integer).append(" ");
        }

        bw.write(dfsResult + "\n");
        bw.flush();
        bw.write(bfsResult.toString());
        bw.flush();

        br.close();
        bw.close();
    }

    public static void addPoint(int point1, int point2) {
        if (!listMap.containsKey(point1)) {
            listMap.put(point1, new ArrayList<>());
        }
        listMap.get(point1).add(point2);
        dfsPointList.put(point1, false);
        bfsPointList.put(point1, false);
    }

    public  static void sort() {
        for (List<Integer> value : listMap.values()) {
            Collections.sort(value);
        }
    }

    public static void dfs(int V){
        if(!dfsPointList.containsKey(V)) {
            dfsPointList.put(V, false);
        }

        if(!dfsPointList.get(V)){
            dfsList.add(V);
            dfsPointList.replace(V, true);
        }

        List<Integer> list = listMap.get(V);
        if(list != null) {
            for (Integer integer : list) {
                if (!dfsPointList.get(integer)) {
                    dfs(integer);
                }
            }
        }
    }

    public static void bfs(int V){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(V);
        bfsList.add(V);
        bfsPointList.replace(V, true);

        while(!queue.isEmpty()) {
            int point = queue.poll();
            List<Integer> list = listMap.get(point);
            if(list != null) {
                for (Integer integer : list) {
                    if (!bfsPointList.get(integer)) {
                        queue.add(integer);
                        bfsList.add(integer);
                        bfsPointList.replace(integer, true);
                    }
                }
            }
        }
    }
}
