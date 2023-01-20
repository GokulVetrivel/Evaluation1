package Evaluation1;

public class Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]coins={3,5,10};
		int amount=87;
		fewest(coins,amount);

	}

	private static void fewest(int[] coins, int amount) {
		// TODO Auto-generated method stub,
		int n=coins.length;
		int[] counts=new int[n];
			for(int i=n-1;i>=0;i--) {
				counts[i]=amount/coins[i];
				amount%=coins[i];
			}
		if(amount==0)
		for(int j=0;j<n;j++)
			System.out.println(coins[j]+" rupee coins "+counts[j]+" numbers");
		else
			System.out.println(-1);
			
	}

}
