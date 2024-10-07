class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int diff = 0,min=prices[0],max=0;
        //min should be updated
        //diff should be updated for max diff found
        for(int i=0;i<len;i++){
                if(prices[i]<min){
                    min = prices[i];
                }
                diff = prices[i]-min;
                max = Math.max(max,diff);
        }
        return max;
    }
}