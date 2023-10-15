package Practice;

import java.util.Scanner;

public class Deserium {
	static int countDigit(int n)
	{
		int count =0;
		while(n>0)
		{
			count ++;
			n=n/10;
		}
		return count;
	}
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
	static boolean isDeseriumNO(int n)
	{ 
		int dc = countDigit(n);
		int sum=0;int temp=n;
		while(n!=0)
		{ 
			int d=n%10;
			sum=sum+pow(d,dc);
			dc--;
			n=n/10;
		}
		return sum==temp;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		boolean rs = isDeseriumNO(n);
		if(rs==true)
		{
			System.out.println("is a deserium No");
		}
		else 
		{
			System.out.println("is not a deserium no");
		}
	}
}
