package question.a_2110;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 2110

- 공유기 설치 (https://www.acmicpc.net/problem/2110)
*/
public class Main {
    static int houseCount;
    static int targetWifiCount;
    static int[] sortedHouses;

    public static void main(String[] args) {
        initInput();
        System.out.println(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());
            houseCount = Integer.parseInt(st.nextToken());
            targetWifiCount = Integer.parseInt(st.nextToken());
            sortedHouses = new int[houseCount];

            for (int i = 0; i < houseCount; i++) {
                sortedHouses[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(sortedHouses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        int low = 1;
        int high = sortedHouses[houseCount - 1] - sortedHouses[0] + 1;

        while (low < high) {
            int mid = (high + low) / 2;

            if (checkInstalledWifiCount(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low - 1;
    }

    private static boolean checkInstalledWifiCount(int checkDistance) {
        int wifiCount = 1;
        int lastInstalledHouse = sortedHouses[0];

        for (int house : sortedHouses) {
            if (house - lastInstalledHouse >= checkDistance) {
                wifiCount++;
                lastInstalledHouse = house;
            }
        }

        return wifiCount < targetWifiCount;
    }
}
