package Question.No11948;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
Acmicpc 11948

- 과목선택 (https://www.acmicpc.net/problem/11948)
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            list1.add(sc.nextInt());
        }

        for (int i = 0; i < 2; i++) {
            list2.add(sc.nextInt());
        }

        list1.sort(Collections.reverseOrder());
        list2.sort(Collections.reverseOrder());

        System.out.println(list1.get(0) + list1.get(1) + list1.get(2) + list2.get(0));
    }
}
