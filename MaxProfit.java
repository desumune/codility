public class MaxProfit {
    public int solution(int[] A) {
        int maxProfit = 0, dayOneStock = Integer.MAX_VALUE;

        for(int a : A) {
            dayOneStock = Math.min(a, dayOneStock);
            maxProfit = Math.max(a - dayOneStock, maxProfit);
        }

        return maxProfit;
    }
}
