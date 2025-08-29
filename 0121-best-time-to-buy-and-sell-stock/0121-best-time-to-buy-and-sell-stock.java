class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int Profit = 0;

        for(int i=0; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            Profit = Math.max (Profit ,prices[i]- min);
        }
        return Profit;
    }
}