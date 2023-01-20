package Evaluation1;

public class RefString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="Hello World Please";
		String refString="Helpw";
		letterCount(inputString,refString);
	}

	private static void letterCount(String inputString, String refString) {
		// TODO Auto-generated method stub
		int count=0;
		String si=inputString.toLowerCase();
		String rs=refString.toLowerCase();
		for(int i=0;i<rs.length();i++) {
			for(int j=0;j<si.length();j++) {
				if(rs.charAt(i)==si.charAt(j)) {
					count++;
				}
			}
			if(i!=rs.length()-1)
				System.out.print(refString.charAt(i)+":"+count+",");
			else
				System.out.print(refString.charAt(i)+":"+count);
			count=0;
		}
		
	}

}
