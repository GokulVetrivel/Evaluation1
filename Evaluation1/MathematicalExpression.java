package Evaluation1;

public class MathematicalExpression {

	public static void main(String[] args) {
		String s = "(ab)(ab+)";
		if(isValidExpression(s))
			System.out.println("Valid");
		else
			System.out.println("Invalid");
		
	}
	private static boolean isValidExpression(String s) {
		char c1='(';
		char c2=')';
		int nc1=0,nc2=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c1) {
				if(!(s.charAt(i+1)>='a' && s.charAt(i+1)<='z')) {
					return false;
				}
				nc1++;
			}
			if(s.charAt(i)==c2) {
				if(!(s.charAt(i-1)>='a' && s.charAt(i-1)<='z')) {
					return false;
				}
				nc2++;
			}
			
		}
		if(nc1==nc2) {
			return true;
		}
		else
			return false;
	}

}
