public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        if(A.length == 0 || A.length == 1 || K == 0)
            return A;

        for(int i = 0; i < K; i++) {
            int temp = A[A.length - 1];

            for(int j = A.length - 2; j >= 0; j--) {
                A[j + 1] = A[j];
            }

            A[0] = temp;
        }

        return A;
    }
}
