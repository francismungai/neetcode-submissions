class Solution {
    public int maxProfit(int[] prices) {
        int minPriceSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPriceSoFar) {
                minPriceSoFar = price;
            } else if (price - minPriceSoFar > maxProfit) {
                maxProfit = price - minPriceSoFar;
            }
        }

        return maxProfit;
    }
}
