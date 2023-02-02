package Evaluation1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinsBacktrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] denominations= {83,408,419,186}; // should be sorted array
		int amount=6249;
		coinsDems(denominations,amount);

	}

	private static void coinsDems(int[] denominations, int amount) {
		// TODO Auto-generated method stub
		List<List<Integer>> list=new ArrayList<>();
		List<Integer> tempList=new ArrayList<>();
		int[] sol=new int[denominations.length];
		
		backtrack(0,denominations,amount,0,list,tempList);
		if(list.size()<1)
			System.err.println("there are no posibble combinations ");
		else {
			System.out.println(list.get(list.size()-1));
			int count=0;
			for(int j=0;j<denominations.length;j++) {
			for(int i=0;i<list.get(list.size()-1).size();i++){
				if(list.get(list.size()-1).get(i)==denominations[j]) {
					count++;
				}
			}
			sol[j]=count;
			count=0;
			}
			System.out.println(Arrays.toString(sol));
			for(int k=0;k<denominations.length;k++) {
				System.out.println(denominations[k]+" reupee coins need "+sol[k]+" numbers");
			}
		}
		
	}

	private static void backtrack(int i, int[] denominations, int amount, int sum, List<List<Integer>> list,
			List<Integer> arrayList) {
		// TODO Auto-generated method stub
		if(i==denominations.length) {
			if(sum==amount) {
				list.add(new ArrayList<>(arrayList));
				return;
			}
			else return;
		}
		if(amount>=sum) {
		sum+=denominations[i];
		arrayList.add(denominations[i]);
//		System.out.println(sum);
//		System.out.println(arrayList);
		backtrack(i,denominations,amount,sum,list,arrayList);
		sum-=denominations[i];
		arrayList.remove(arrayList.size()-1);
		}
		backtrack(i+1,denominations,amount,sum,list,arrayList);
	}

	

}
