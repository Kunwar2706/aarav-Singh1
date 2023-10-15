package Practice;

import java.util.Scanner;

public class PrimeNO3 {
	public static void main(String[] args, int i) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int count=0;
		for(int i1=1;i1<=n;i1++);
		{
			if(n%i==0)
			{
				count++;
		    }
		}
		if(count==2)
		{
			System.out.println(+n  +" " +"is a prime  no");
		}
		else
		{
			System.out.println(+n  +"  "+ "is not  a prime  no");
		}
			

	}

}
