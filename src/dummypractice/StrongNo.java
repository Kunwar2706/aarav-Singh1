package dummypractice;

import java.util.Scanner;

public class StrongNo{
	static int getFact(int x)
	{
		int fact=1;
		while(x>0)
		{
			fact =fact*x;
			x--;
		}
		return fact;
		
	}
static boolean	isStrongNo(int n) {
	int sum=0;int temp=n;
	do
	  {
		int d=n%10;
		sum=sum+getFact(d);
		n=n/10;
	  }
	  while(n!=0);
	   return sum==temp;
      }
	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	boolean rs=isStrongNo(n);//145
	if(rs==true)
		System.out.println("is a strong no");
		else
		
	     System.out.println("is not a strong  no");
	}

}
