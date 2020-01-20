public class PermMissingElem {
    public int solution(int[] A) {
        int maxN = 0;
        int realN = 0;

        for(int i = 0; i <= A.length + 1; i++)
            maxN += i;

        for(int i : A)
            realN += i;

        return maxN - realN;
    }
}
