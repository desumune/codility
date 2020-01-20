public class MaxProductOfThree {
    public int solution(int[] A) {
        int firstLargest = -1001, secondLargest = -1001, thirdLargest = -1001;
        int firstSmallest = 1001, secondSmallest = 1001, thirdSmallest = 1001;

        for(int i : A) {
            if(i > thirdLargest) {
                firstLargest = secondLargest;
                secondLargest = thirdLargest;
                thirdLargest = i;
                continue;
            }

            if(i > secondLargest) {
                firstLargest = secondLargest;
                secondLargest = i;
                continue;
            }

            if(i > firstLargest) {
                firstLargest = i;
            }
        }

        for(int i : A) {
            if(i < thirdSmallest) {
                firstSmallest = secondSmallest;
                secondSmallest = thirdSmallest;
                thirdSmallest = i;
                continue;
            }

            if(i < secondSmallest) {
                firstSmallest = secondSmallest;
                secondSmallest = i;
                continue;
            }

            if(i < firstSmallest) {
                firstSmallest = i;
            }
        }

        if(thirdLargest < 0)
            return thirdLargest * secondLargest * firstLargest;
        else if(thirdSmallest * secondSmallest > secondLargest * firstLargest)
            return thirdLargest * thirdSmallest * secondSmallest;
        else
            return thirdLargest * secondLargest * firstLargest;
    }
}
