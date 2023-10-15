package dummypractice;

import java.util.Scanner;

public class CheckPrimeNo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int count=0;
for(int i=1;i<=n;i++)
{
	if(n%i==0)
	{
		count++;
	}
}
	if(count==2)
	{
		System.out.println(n+" is a prime no");
	}
	else
	{
		System.out.println(n+" is not a prime no");
	}
}
	}


