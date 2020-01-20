import java.util.ArrayList;
import java.util.List;

public class CountNonDivisible {
    public int[] solution(int[] A)  {
        int length = A.length * 2;
        List<Integer>[] divisors = new ArrayList[length];

        for(int i = 0; i < length; i++) {
            divisors[i] = new ArrayList<>();
        }

        for(int i = 1; i <= length; i++) {
            int j = i;
            while(j <= length) {
                divisors[j - 1].add(i);
                j += i;
            }
        }

        int[] isPresent = new int[length];

        for(int i : A)
            isPresent[i - 1]++;

        int[] solutions = new int[A.length];

        for(int i = 0; i < A.length; i++) {
            int nonDivisors = A.length;

            for(int j : divisors[A[i] - 1])
                nonDivisors -= isPresent[j - 1];

            solutions[i] = nonDivisors;
        }

        return solutions;
    }
}
