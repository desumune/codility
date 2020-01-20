public class NumberSolitare {
    public int solution(int[] A) {
        int[] moves = new int[A.length];

        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            moves[i] = sum;
        }

        for(int i = 1; i < 6; i++) {
            for(int j = i + 1; j < A.length; j++) {
                int max = Integer.MIN_VALUE;

                for(int k = 1; k <= i + 1; k++) {
                    max = Math.max(max, moves[j - k]);
                }

                moves[j] = Math.max(max + A[j], moves[j]);
            }
        }

        return moves[A.length - 1];
    }
}
