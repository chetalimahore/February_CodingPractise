/*------Returns the maximum profit earned between buying and selling of a stock*/

public class BestBuySellStock {

	/* brute force, checking each day's value with previous days values, complexity is O(n^2)*/
	int maxProfit(int prices[]) {
        int sp = prices[0], cp = prices[0], profit = 0 ;
        int j = 0, min = 0;
        for(int i = 1 ; i < prices.length ; i++){ 
            j = 0;
            while( j < i ){
                    if(prices[i] > prices[j] && (prices[i] - prices[j] > profit)) {
                        profit = prices[i] - prices[j];
                        min = j; 
                        sp = prices[i];
                        cp = prices[min];
                    }
                    j++;
                }
               j = 0;

            }
        return (sp - cp);
	}
	
	
	/*Dynamic approach: storing the minimum value and comparing, complexity is O(n) */
	
	int maxProfitEarned(int prices[]){
		if(prices.length == 0){
			return 0;
		}
		int min = prices[0];
		int profit = 0 ;
		for(int i = 1; i < prices.length; i++){
			if(prices[i] > min && (prices[i] - min > profit)){
				profit = prices[i] - min;
			}
			else if(prices[i] < min){
				min = prices[i];
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestBuySellStock best = new BestBuySellStock();
		int prices [] = {7, 6,5,4, 3};
		System.out.println(best.maxProfitEarned(prices));
	}

}