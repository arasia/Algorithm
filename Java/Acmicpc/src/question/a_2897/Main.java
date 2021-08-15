package question.a_2897;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 2897

- 몬스터 트럭 (https://www.acmicpc.net/problem/2897)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken()), C = Integer.parseInt(st.nextToken());

            char[][] map = new char[R][C];
            for (int i = 0; i < R; i++) {
                if (C >= 0) System.arraycopy(br.readLine().toCharArray(), 0, map[i], 0, C);
            }

            int[] result = new int[5];

            for (int i = 0; i < R - 1; i++) {
                for (int j = 0; j < C - 1; j++) {
                    int b = 0;
                    int c = 0;

                    for (int k = 0; k < 2; k++) {
                        for (int l = 0; l < 2; l++) {
                            switch (map[i + k][j + l]) {
                                case '#':
                                    b++;
                                    break;
                                case 'X':
                                    c++;
                                    break;
                            }
                        }
                    }

                    if (b != 0) {
                        continue;
                    }

                    result[c]++;
                }
            }

            for (int i : result) {
                bw.write(i + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
