class Solution {
    public int maxProfit(int[] prices) {
        int lowestPrice = Integer.MAX_VALUE;
        int bestProfit = 0;

        for (int price : prices) {
            if (price < lowestPrice) {
                lowestPrice = price;
            } else {
                bestProfit = Math.max(bestProfit, price - lowestPrice);
            }
        }

        return bestProfit;
    }
}