package amit;

public class SumOfDigit {
	static int digitSum(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int ds = digitSum(235);
		System.out.println(ds);
	}

}
