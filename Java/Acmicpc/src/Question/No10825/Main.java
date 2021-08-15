package Question.No10825;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Student> studentArrayList = new ArrayList<>();

        for(int i = 0 ; i < N ; i++) {
            String name = sc.next();
            int ko = sc.nextInt();
            int en = sc.nextInt();
            int math = sc.nextInt();
            studentArrayList.add(new Student(name, ko, en, math));
        }

        Collections.sort(studentArrayList);

        for(int i = 0 ; i < N ; i++) {
            System.out.println(studentArrayList.get(i).getName());
        }
    }

    private static class Student implements Comparable<Student> {
        private String name;
        private int ko;
        private int en;
        private int math;

        public Student(String name, int ko, int en, int math) {
            this.name = name;
            this.ko = ko;
            this.en = en;
            this.math = math;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getKo() {
            return ko;
        }

        public void setKo(int ko) {
            this.ko = ko;
        }

        public int getEn() {
            return en;
        }

        public void setEn(int en) {
            this.en = en;
        }

        public int getMath() {
            return math;
        }

        public void setMath(int math) {
            this.math = math;
        }

        @Override
        public int compareTo(Student student) {
            int result = Integer.compare(this.getKo(), student.getKo());
            result *= -1;
            if(result == 0){
                result = Integer.compare(this.getEn(), student.getEn());
                if(result == 0) {
                    result = Integer.compare(this.getMath(), student.getMath());
                    result *= -1;
                    if(result == 0) {
                        result = this.getName().compareTo(student.getName());
                    }
                }
            }
            return result;
        }
    }
}
