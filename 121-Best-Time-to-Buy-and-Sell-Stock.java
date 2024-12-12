// class Solution {
//     public int maxProfit(int[] prices) {
//        int length = prices.length;
//        int diff=0;
//        int maximum = Integer.MIN_VALUE;

//        for(int i=length-1; i>0; i--){
//         for(int j=0; j<i; j++){
//             if(prices[i]>prices[j]){
//                 diff=prices[i]-prices[j];
//                 if(diff>maximum){
//                     maximum=diff;
//                 }
//             }
//         }
//        }
//        if(maximum<0){
//         return 0;
//        }
//        return maximum; 
//     }
// }


class Solution{
    public int maxProfit(int[] prices){
        int profit=0;
        int cost=0;
        int min = prices[0];
        int length = prices.length;
        
        for(int i=1; i<length; i++){
            cost= prices[i]-min;

            profit= Math.max(profit, cost);

            min = Math.min(min, prices[i]);
        }
        return profit;
    }
}