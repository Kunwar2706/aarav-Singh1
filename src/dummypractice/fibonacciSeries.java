package dummypractice;

import java.util.Scanner;

public class fibonacciSeries {
	static int getFib(int n)
	{
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return getFib(n-1)+getFib(n-2);


	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int fs = getFib(n);
		System.out.println(fs);
	}

}
