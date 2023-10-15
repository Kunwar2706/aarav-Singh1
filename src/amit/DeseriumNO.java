package amit;

import java.util.Scanner;

public class DeseriumNO {
	static int pow(int n,int p)
	{
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
			p--;
		}
		return pow;

	}
	static int digitCount(int n)
	{
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();//135
		int sum=0;int temp=n;
		int dc=digitCount(n);
		do {
			int d=n%10;
			sum=sum+pow(d,dc);
			dc--;
			n=n/10;
		}
		while(n!=0);
		{
			if(sum==temp)
			{
				System.out.println(+temp+" is a deserium no");
			}
			else
			{
				System.out.println(+temp+" is not a deserium no");
			}

		}


	}

}
