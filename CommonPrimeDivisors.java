import java.util.ArrayList;
import java.util.List;

public class CommonPrimeDivisors {
    public int solution(int[] A, int[] B) {
        int max = Integer.MIN_VALUE;

        for(int i : A)
            max = Math.max(max, i);

        for(int i : B)
            max = Math.max(max, i);

        boolean[] isNotPrime = new boolean[max];
        for(int i = 2; i * i <= isNotPrime.length; i++) {
            int j = i * i;

            while(j <= isNotPrime.length) {
                isNotPrime[j - 1] = true;
                j += i;
            }
        }

        List<Integer> primes = new ArrayList<>();
        for(int i = 1; i < isNotPrime.length; i++)
            if(!isNotPrime[i])
                primes.add(i + 1);

        List<Integer>[] primeDivisors = new List[max];
        for(int i = 1; i <= max; i++) {
            primeDivisors[i - 1] = new ArrayList<>();
            for(int j = 0; j < primes.size() && primes.get(j) <= max; j++)
                if(i % primes.get(j) == 0)
                    primeDivisors[i - 1].add(primes.get(j));
        }

        int counter = 0;
        for(int i = 0; i < A.length; i++)
            if(primeDivisors[A[i] - 1].equals(primeDivisors[B[i] - 1]))
                counter++;

        return counter;
    }
}
