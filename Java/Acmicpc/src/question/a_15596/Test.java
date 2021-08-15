package question.a_15596;

/*
Acmicpc 15596

- 정수 N개의 합 (https://www.acmicpc.net/problem/15596)
*/
public class Test {
    public long sum(int[] a) {
        return java.util.Arrays.stream(a).asLongStream().sum();
    }
}
