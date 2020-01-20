public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];

        int maxValue = 0;
        int newMaxValue = 0;

        for (int i = 0; i < N; i++) {
            counters[i] = 0;
        }

        for(int i = 0; i < A.length; i++) {
            if(A[i] == N + 1) {
                maxValue = newMaxValue;
            }
            else {
                counters[A[i] - 1] = Math.max(counters[A[i] - 1], maxValue);
                counters[A[i] - 1]++;

                newMaxValue = Math.max(counters[A[i] - 1], newMaxValue);
            }
        }

        for(int i = 0; i < N; i++) {
            counters[i] = Math.max(counters[i], maxValue);
        }

        return counters;
    }
}
