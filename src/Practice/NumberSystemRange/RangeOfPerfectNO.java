package Practice.NumberSystemRange;

import java.util.Scanner;

public class RangeOfPerfectNO {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
		int n=s.nextInt();

		for(int num=2;num<=n;num++)
		{ 
			int sum=0; 
			for(int i=1;i<num;i++)
			{
				if(num%i==0)
					sum=sum+i;
			}
			
				if(sum==num)
				{
					System.out.println(num+" is  a prfect no");

				}
			}
	}}

