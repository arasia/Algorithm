package question.a_11656;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Acmicpc 11656

- 접미사 배열 (https://www.acmicpc.net/problem/11656)
*/
public class Main {
    public static void main(String[] args) {
        String input = new java.util.Scanner(System.in).next();
        List<String> list = new ArrayList<>();

        int len = input.length();
        for (int i = 0; i < len; i++) {
            list.add(input.substring(i));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for (String s : list) {
            sb.append(s).append("\n");
        }

        System.out.println(sb.toString());
    }
}
