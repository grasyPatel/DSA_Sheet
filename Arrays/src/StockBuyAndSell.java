public class StockBuyAndSell {
    public int solution(int arr[]){
        int minPrice=arr[0];
        int profit=0;
        int maxProfit=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<minPrice){
                minPrice=arr[i];

            }
            profit=arr[i]-minPrice;
            maxProfit=Math.max(profit,maxProfit);


        }
        return maxProfit;
    }
}
