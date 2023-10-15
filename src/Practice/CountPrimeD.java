package Practice;

import java.util.Scanner;

public class CountPrimeD {
static int countPD(int n)
{
	int count=0;
	do 
	{
		int d=n%10;
		if(d==1||d==2||d==3||d==7)
			count ++;
			n=n/10;
	}
	while(n!=0);
	return count;
		
}
	public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("enter the no");
      int n=s.nextInt();
      int  c=countPD(n);
      System.out.println(c);
	}

}
