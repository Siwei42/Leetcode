public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0)
            return 0;
        int min = prices[0] , maxProfit = 0;
        for(int price : prices){
            if(price < min)
                min = price;
            if(price - min > maxProfit)
                maxProfit = price - min;
        }
        return maxProfit;
    }
}