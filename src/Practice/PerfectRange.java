package Practice;

import java.util.Scanner;

public class PerfectRange {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		int sum=0;
		for(int i1=1;i1<=n/2;i1++)
		{
		if(n%i1==0)
		{
	      sum=sum+i1;
		}
		if(sum==n)
		{
			System.out.println(+n+""+"is a pperfect no");
		}
		
		
	}

	}
	}}
