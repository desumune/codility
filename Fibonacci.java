public class Fibonacci {
    public int solution(int N) {
        int[] fib = new int[N + 1];
        fib[1] = 1;

        for(int i = 2; i <= N; i++)
            fib[i] = fib[i - 1] + fib[i - 2];

        return fib[N];
    }

    public int solution2(int N) {
        if(N <= 1)
            return N;

        return solution2(N - 1) + solution2(N - 2);
    }
}
