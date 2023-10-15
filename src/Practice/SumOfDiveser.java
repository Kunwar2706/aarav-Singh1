package Practice;

public class SumOfDiveser {
	static  int sumOfDivisor(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
	int s=sumOfDivisor(6);
System.out.println(s);
	}

}
