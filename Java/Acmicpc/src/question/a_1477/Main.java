package question.a_1477;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
Acmicpc 1477

- 휴게소 새우기 (https://www.acmicpc.net/problem/1477)
*/
public class Main {
    static int targetRestCount;
    static int loadLength;
    static int[] diffs;

    public static void main(String[] args) {
        initInput();
        System.out.println(solve());
    }

    private static void initInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        try (br) {
            st = new StringTokenizer(br.readLine());

            int currentRestCount = Integer.parseInt(st.nextToken());
            targetRestCount = Integer.parseInt(st.nextToken());
            loadLength = Integer.parseInt(st.nextToken());
            int[] rests = new int[currentRestCount + 2];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < currentRestCount; i++) {
                rests[i] = Integer.parseInt(st.nextToken());
            }

            rests[currentRestCount] = 0;
            rests[currentRestCount + 1] = loadLength;
            Arrays.sort(rests);

            diffs = new int[currentRestCount + 1];
            for (int i = 0; i <= currentRestCount; i++) {
                diffs[i] = rests[i + 1] - rests[i];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int solve() {
        int low = 1;
        int high = loadLength;
        int result = 0;

        while (low <= high) {
            int mid = (high + low) / 2;

            if (checkAddRestCount(mid)) {
                high = mid - 1;
                result = mid;
            } else {
                low = mid + 1;
            }
        }

        return result;
    }

    private static boolean checkAddRestCount(int checkDistance) {
        int addRestCount = 0;

        for (int diff : diffs) {
            if (diff > checkDistance) {
                if (diff % checkDistance == 0) {
                    addRestCount += (diff / checkDistance) - 1;
                } else {
                    addRestCount += diff / checkDistance;
                }
            }
        }

        return addRestCount <= targetRestCount;
    }
}
