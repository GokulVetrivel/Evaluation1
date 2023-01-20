package Evaluation1;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,1,5};
		splitEqualArrays(a);
	}

	private static void splitEqualArrays(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length,sum=0;
		int total=sum(a)/2;
		int[] a1=new int[n];
		int[] a2=new int[n];
		for(int i=0;i<n;i++) {
			sum+=a[i];
			a1[i]=a[i];
			if(sum==total) {
				sum=0;
			}
		}
		System.out.println(java.util.Arrays.toString(a1));
	}

	private static int sum(int[] a) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}

}
