public class SticksTriangles {
    //supposedly O(N*N) but doesn't work to me
    public int solution(int[] A) {
        int result = 0;
        for(int x = 0; x < A.length; x++) {
            int z = x + 2;
            for(int y = x + 1; y < A.length; y++) {
                while(z < A.length && A[x] + A[y] > A[z])
                    z++;
                result += z - y - 1;
            }
        }

        return result;
    }

    //O(N*N*N)
    public int solution2(int[] A) {
        int result = 0;
        for(int x = 0; x < A.length - 2; x++)
            for(int y = x + 1; y < A.length - 1; y++)
                for(int z = y + 1; z < A.length; z++ )
                    if(A[x] + A[y] > A[z])
                        result++;

        return result;
    }
}
