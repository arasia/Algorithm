package Question.No7568;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
Acmicpc
- 덩치 (https://www.acmicpc.net/problem/7568)
 */
public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {
            List<Person> personList = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                personList.add(new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), 0));
            }

            for (Person currentPerson : personList) {
                for (Person person : personList) {
                    if ((currentPerson.height < person.height) && (currentPerson.weight < person.weight)) {
                        currentPerson.count++;
                    }
                }
                bw.write((currentPerson.count + 1) + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static class Person {
        private int weight;
        private int height;
        private int count;

        public Person(int weight, int height, int count) {
            this.weight = weight;
            this.height = height;
            this.count = count;
        }
    }
}
