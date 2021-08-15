package Question.No14593;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
Acmicpc 14593

- 2017 아주대학교 프로그래밍 경시대회 (Large) (https://www.acmicpc.net/problem/14593)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            int N = Integer.parseInt(br.readLine());
            int prePoint = -1;
            int preSubmit = -1;
            int preTime = -1;
            int index = -1;

            for (int i = 1; i <= N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int point = Integer.parseInt(st.nextToken());
                int submit = Integer.parseInt(st.nextToken());
                int time = Integer.parseInt(st.nextToken());

                boolean check = false;
                if (point > prePoint) {
                    check = true;
                } else if(point == prePoint) {
                    if (submit < preSubmit) {
                        check = true;
                    } else if(submit == preSubmit){
                        if (time < preTime) {
                            check = true;
                        }
                    }
                }

                if (check) {
                    index = i;
                    prePoint = point;
                    preSubmit = submit;
                    preTime = time;
                }
            }

            bw.write(Integer.toString(index));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
