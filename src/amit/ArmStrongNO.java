package amit;

import java.util.Scanner;

public class ArmStrongNO {
	static int getPow(int n,int p) {
		int pow=1;
		while(p>0)
		{
			pow=pow*n;
			p--;
		}
		return pow;
	}
	static int digitCount(int n) {
		int count=0;
		while(n!=0)
		{
			count++;
			n=n/10;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int sum=0; int temp=n;
		int dc=digitCount(n);
		do 
		{
			int d=n%10;
			
			sum=sum+getPow(d,dc);
			n=n/10;
		}  
		while(n!=0);
		{
			if(sum==temp)
			{
				System.out.println(temp+ " is a arm strong no");
			}
			else 
			{
				System.out.println(temp+" is not a arm strong no");	
			}
		}

	}

}
