package dummypractice;

import java.util.Scanner;

public class PrimeNo111 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
			
		}
		if(count==2)
		{
			System.out.println("no is a prime ");
		}
		else 
		{
			System.out.println("no is not a prime ");
		}

	}

}
