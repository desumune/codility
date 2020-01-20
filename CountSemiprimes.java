import java.util.ArrayList;

public class CountSemiprimes {
    public int[] solution(int N, int[] P, int[] Q) {
        int[] solutions = new int[P.length];

        boolean[] notPrimes = notPrimes(N);

        ArrayList<Integer> primes = new ArrayList<>();

        for(int i = 1; i < N; i++)
            if(!notPrimes[i])
                primes.add(i + 1);

        boolean[] semiprimes = new boolean[N];

        for(int i = 0; i < primes.size(); i++)
            for(int j = i; j < primes.size(); j++) {
                long semiprime = (long) primes.get(i) * (long) primes.get(j);

                if(semiprime > N)
                    break;

                semiprimes[(int) semiprime - 1] = true;
            }

        int[] semiprimesSums = new int[N];

        for(int i = 1; i < N; i++) {
            semiprimesSums[i] = semiprimesSums[i - 1];

            if(semiprimes[i])
                semiprimesSums[i]++;
        }

        for(int i = 0; i < P.length; i++)
            solutions[i] = semiprimesSums[Q[i] - 1] - semiprimesSums[Math.max(P[i] - 2, 0)];

        return solutions;
    }

    private boolean[] notPrimes(int N) {
        int end = (int) Math.sqrt(N);
        boolean[] notPrimes = new boolean[N];

        for(int i = 2; i < end; i++) {
            int j = i * i;

            for(j = j; j <= N; j += i)
                notPrimes[j - 1] = true;
        }
        return notPrimes;
    }
}