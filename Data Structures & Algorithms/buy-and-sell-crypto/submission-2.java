class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0], max = 0;int profit = 0;
        for (int price : prices)
        {  
           minPrice=Math.min(minPrice,price);
           profit=price-minPrice;
           max=Math.max(max,profit);
            
        }return max;
    }
}
