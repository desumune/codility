public class MinAvgTwoSlice {
    public int solution(int[] A) {
        double[] doubleA = new double[A.length];
        double minAvg = Double.MAX_VALUE;
        int index = 0;

        for(int i = 0; i < doubleA.length; i++) {
            doubleA[i] = Double.valueOf(A[i]);
        }

        for(int i  = 0; i < doubleA.length - 2; i++) {
            double avg2 = (doubleA[i] + doubleA[i + 1]) / 2;
            double avg3 = (doubleA[i] + doubleA[i + 1] + doubleA[i + 2]) / 3;
            double minLocalAvg = Math.min(avg2, avg3);

            if(minLocalAvg < minAvg) {
                minAvg = minLocalAvg;
                index = i;
            }
        }

        if((doubleA[doubleA.length - 2] + doubleA[doubleA.length - 1]) / 2 < minAvg)
            index =  doubleA.length - 2;

        return index;
    }
}
