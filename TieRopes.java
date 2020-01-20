public class TieRopes {
    public int solution(int K, int[] A) {
        int count = 0, currentLength = 0;

        for(int i : A) {
            currentLength += i;
            if(currentLength >= K) {
                count++;
                currentLength = 0;
            }
        }

        return count;
    }
}
