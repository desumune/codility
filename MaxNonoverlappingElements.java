public class MaxNonoverlappingElements {
    public int solution(int[] A, int[] B) {
        int count = 0, currentEnd = -1;

        for(int i = 0; i < A.length; i++) {
            if(A[i] > currentEnd) {
                count++;
                currentEnd = B[i];
            }
        }

        return count;
    }
}
