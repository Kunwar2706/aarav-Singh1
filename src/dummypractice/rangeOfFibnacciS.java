package dummypractice;

import java.util.Scanner;

public class rangeOfFibnacciS {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
		int n=s.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			if(c<=n) {
				System.out.println(c);

				a=b;
				b=c;

			}
		}

	}
}
