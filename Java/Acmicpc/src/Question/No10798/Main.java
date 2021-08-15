package Question.No10798;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/*
Acmicpc
- 세로읽기 (https://www.acmicpc.net/problem/10798)
*/
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<StringBuilder> stringBuilderList = new ArrayList<>();
            int N = 5;

            while (N-- > 0) {
                String currentString = br.readLine();
                for (int i = 0; i < currentString.length(); i++) {
                    if(i > (stringBuilderList.size() - 1)) {
                        stringBuilderList.add(new StringBuilder());
                    }
                    stringBuilderList.get(i).append(currentString.charAt(i));
                }
            }

            for (StringBuilder stringBuilder : stringBuilderList) {
                bw.write(stringBuilder.toString());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
