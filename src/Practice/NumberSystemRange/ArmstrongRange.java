package Practice.NumberSystemRange;

import java.util.Scanner;

public class ArmstrongRange {
	static int pow(int n,int p)
	{
		int pow=1;
		while(p>0)
		{
			pow =pow*n;
			p--;

		}
		return pow;
	}
	static int digitCount(int n)
	{
		int count =0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	static boolean isArmstrong(int n)
	{
		int dc=digitCount(n);
		int sum=0;int temp=n;
		while(n!=0)
		{
			int d=n%10;
			sum=sum+pow(d,dc);
			n=n/10;

		}
		return sum==temp;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			boolean rs=isArmstrong(i);
			if(rs==true)
			{
				System.out.println(i+" is a arm strong no");
			}

		}

	}
}
