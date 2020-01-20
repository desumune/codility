public class MinPerimeterRectangle {
    public int solution(int N) {
        int n = (int) Math.sqrt(N);

        while(N % n != 0)
            n--;

        return 2 * (n + (N / n));
    }
}
