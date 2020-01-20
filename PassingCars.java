public class PassingCars {
    public int solution(int[] A) {
        int goingThisDirection = 0, pairs = 0;

        for(int i : A) {
            if(pairs > 1000000000)
                return -1;

            if(i == 0)
                goingThisDirection++;
            else
                pairs += goingThisDirection;
        }

        return pairs;
    }
}
