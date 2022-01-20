package question.a_1005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.StringTokenizer;

/*
Acmicpc 1005

- ACM Craft (https://www.acmicpc.net/problem/1005)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int testCount = Integer.parseInt(br.readLine());

            while (testCount-- > 0) {
                bw.write(solve(br) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve(BufferedReader br) throws IOException {
        StringTokenizer token = new StringTokenizer(br.readLine());
        int buildingCount = Integer.parseInt(token.nextToken());
        int craftPolicyCount = Integer.parseInt(token.nextToken());
        int[] buildTimes = new int[buildingCount + 1];
        int[] connectedLines = new int[buildingCount + 1];
        int[] resultTimes = new int[buildingCount + 1];

        Map<Integer, List<Integer>> lines = new HashMap<>();

        initBuildTime(br, buildingCount, buildTimes);
        initLines(buildingCount, lines);
        setLines(br, craftPolicyCount, connectedLines, lines);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= buildingCount; i++) {
            if (connectedLines[i] == 0) {
                queue.add(i);
                resultTimes[i] = buildTimes[i];
            }
        }

        while (!queue.isEmpty()) {
            int currentBuild = queue.poll();

            for (Integer nextBuild : lines.get(currentBuild)) {
                resultTimes[nextBuild] = Math.max(resultTimes[nextBuild], resultTimes[currentBuild] + buildTimes[nextBuild]);
                connectedLines[nextBuild]--;

                if (connectedLines[nextBuild] == 0) {
                    queue.add(nextBuild);
                }
            }
        }

        return resultTimes[Integer.parseInt(br.readLine())];
    }

    private static void setLines(BufferedReader br, int craftPolicyCount, int[] connectedLines, Map<Integer, List<Integer>> lines) throws IOException {
        for (int i = 0; i < craftPolicyCount; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(token.nextToken());
            int to = Integer.parseInt(token.nextToken());

            connectedLines[to]++;
            lines.get(from).add(to);
        }
    }

    private static void initLines(int buildingCount, Map<Integer, List<Integer>> lines) {
        for (int i = 1; i <= buildingCount; i++) {
            lines.put(i, new ArrayList<>());
        }
    }

    private static void initBuildTime(BufferedReader br, int buildingCount, int[] buildTime) throws IOException {
        StringTokenizer token = new StringTokenizer(br.readLine());

        for (int i = 1; i <= buildingCount; i++) {
            buildTime[i] = Integer.parseInt(token.nextToken());
        }
    }
}
