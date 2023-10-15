package Practice;

import java.util.Scanner;

public class SumEO {
	static void printSumEO(int n)
	{
		int es=0; int os=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				es=es+i;
			}
			else {
				os=os+i;
			}

		} 
		System.out.println("sum of even no within the n=" +es);
		System.out.println("sum of odd no within the n=" +os);
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		printSumEO(n);
	}

}
