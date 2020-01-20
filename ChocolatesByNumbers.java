public class ChocolatesByNumbers {
    public int solution(int N, int M) {
        return N / gcb(N, M, 1);
    }

    private int gcb(int a, int b, int res) {
        if(a == b)
            return a * res;
        else if(a % 2 == 0 && b % 2 == 0)
            return gcb(a / 2, b / 2, 2 * res);
        else if(a % 2 == 0)
            return gcb(a / 2, b, res);
        else if(b % 2 == 0)
            return gcb(a, b / 2, res);
        else if(a > b)
            return gcb(a - b, b, res);
        else
            return gcb(a, b - a, res);
    }
}
