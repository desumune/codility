import java.util.Arrays;

public class DynamicDenominations {
    public int[] solution(int[] A, int K) {
        int[] dp = new int[K];

        dp[0] = 0;
        Arrays.fill(dp, 1, dp.length, Integer.MAX_VALUE);

        for(int i = 1; i < A.length; i++)
            for(int j = A[i - 1]; j < K; j++)
                dp[j] = Math.min(dp[j - A[i - 1]] + 1, dp[j]);

        return dp;
    }
}
