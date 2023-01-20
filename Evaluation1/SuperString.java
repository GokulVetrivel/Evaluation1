package Evaluation1;

import java.util.Arrays;

public class SuperString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1= {"ceo","alco","caaeio","ceai"};
		String[] s2= {"ec","oc","ceo"};
		System.out.println(noOfSuperString(s1,s2));

	}

	private static int noOfSuperString(String[] s1, String[] s2) {
		// TODO Auto-generated method stub
		int count=0,res=0;
		for(int i=0;i<s1.length;i++) {
			for(int j=0;j<s2.length;j++) {
				if(isContain(s2[j],s1[i])) {
					count++;
				}	
			}
			if(count==s2.length) 
				res++;
				
			count=0;
		}
		return res;
	}
	
	static boolean isContain(String s1,String s2){
		int count=0;
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		for(int i=0;i<c1.length;i++) {
			for(int j=0;j<c2.length;j++) {
				if(c1[i]==c2[j]) {
					count++;
					break;
				}
			}
			
		}
		if(count==c1.length)
			return true;
		return false;
	}
	
}
