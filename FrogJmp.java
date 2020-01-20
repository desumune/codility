public class FrogJmp {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil((Double.valueOf(Y) - Double.valueOf(X)) / Double.valueOf(D));
    }
}
