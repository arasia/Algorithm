import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 1268

- 임시 반장 정하기 (https://www.acmicpc.net/problem/1268)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int[][] student = new int[N + 1][5];

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 5; j++) {
                    int n = Integer.parseInt(st.nextToken());
                    student[i][j] = n;
                }
            }

            int max = -1;
            int index = 0;
            for (int i = 1; i <= N; i++) {
                int current = 0;
                for (int j = 1; j <= N; j++) {
                    boolean check = false;
                    for (int k = 0; k < 5; k++) {
                        if (student[i][k] == student[j][k]) {
                            check = true;
                            break;
                        }
                    }
                    if (check) {
                        current++;
                    }
                }

                if (current > max) {
                    max = current;
                    index = i;
                }

            }

            bw.write(String.valueOf(index));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
