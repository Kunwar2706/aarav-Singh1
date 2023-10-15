package amit;

import java.util.Scanner;

public class HappyNo {
	static boolean isHappyNO(int n)
	{
		while (n>9)
		{
			int sum=0;
			do 
			{ 
				int d=n%10;
				sum=sum+d*d;
				n=n/10;
			}
			while(n!=0);
			{
				n=sum;

			}
		}
			if(n==1|| n==7)
			{
				return true;

			}
			else
			{
				return false;
			}    
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		boolean rs = isHappyNO(n);
		if(rs=true)
		{
			System.out.println("is a happy no");
		}
		else
		{
			System.out.println("is not a happy no");
		}
	}

}
