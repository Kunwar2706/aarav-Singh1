package Practice.NumberSystemRange;

import java.util.Scanner;

public class StrongnRange {
	static int fact(int n) {
		int fact=1;
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the range");
		int n=s.nextInt();
		
		for(int i=1;i<=n;i++) {
			int sum=0;int num=i; int temp=num;
			while(num!=0)
			{
				int d=num%10;
				sum=sum+fact(d);
				num=num/10;
			}
			if(sum==temp) {
				System.out.println(temp+" is a strong no");
			}

		}
	}
}
