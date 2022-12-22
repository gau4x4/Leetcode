class Solution {
    public int maxProfit(int[] prices) {
        int max_profit = Integer.MIN_VALUE, buy_price = 10_00_000;

        for(int price:prices){
            buy_price = Math.min(price,buy_price);
            int profit = price - buy_price;
            max_profit = Math.max(max_profit,profit);
        }
        return max_profit;
    }
}