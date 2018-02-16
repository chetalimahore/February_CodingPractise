/*------Returns the maximum profit earned between buying and selling of a stock*/

public class BestBuySellStock {

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BestBuySellStock best = new BestBuySellStock();
		int prices [] = {7, 6, 4, 3, 1};
		System.out.println(best.maxProfit(prices));
	}

}