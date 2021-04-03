import java.io.*;
import java.util.*;

/*
Acmicpc 14889

- 스타트와 링크 (https://www.acmicpc.net/problem/14889)
*/
public class Main {
    static int N;
    static int[][] arr;
    static Boolean[] team;

    static int result = Integer.MAX_VALUE;

    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            N = Integer.parseInt(br.readLine());
            arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int index = 0;
                while (st.hasMoreTokens()) {
                    arr[i][index++] = Integer.parseInt(st.nextToken());
                }
            }

            team = new Boolean[N];
            Arrays.fill(team, false);

            makeTeam(0, 0);

            bw.write(Integer.toString(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void makeTeam(int index, int count) {
        if (result == 0) {
            return;
        }

        if (count == N / 2) {
            checkTeamDiffPoint();
        }

        for(int i = index; i < N; i++) {
            if(!team[i]) {
                team[i] = true;
                makeTeam(i + 1, count + 1);
                team[i] = false;
            }
        }
    }

    private static void checkTeamDiffPoint() {
        Map<Boolean, List<Integer>> listMap = new HashMap<>();
        listMap.put(false, new ArrayList<>());
        listMap.put(true, new ArrayList<>());

        for (int i = 0; i < team.length; i++) {
            listMap.get(team[i]).add(i);
        }

        result = Math.min(result, Math.abs(calTeamPoint(listMap.get(false)) - calTeamPoint(listMap.get(true))));
    }

    private static int calTeamPoint(List<Integer> integers) {
        int result = 0;

        for (Integer integer : integers) {
            for (Integer integer1 : integers) {
                result += arr[integer][integer1];
            }
        }
        return result;
    }
}
