public class CountFactors {
    public int solution(int N) {
        int count = 2;

        if(Math.sqrt(N) % 1 == 0)
            count--;

        for(int i = 2; i <= Math.sqrt(N); i++)
            if(N % i == 0)
                count += 2;

        return count;
    }
}
