package amit;

public class SumOfDivisor {
 static int getSum(int n)
 {
	 int sum=0;
	 for(int i=1;i<n;i++)
	 {
		 if(n%i==0)
			 sum=sum+i;
	 }
	return sum;
 }
	public static void main(String[] args) {
		int s=getSum(9);
		System.out.println(s);
	}

}
