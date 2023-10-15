package amit;

import java.util.Scanner;

public class CountDivisor {
   static int getCountDivisor(int n)
   {
	   int count =0;
	   for(int i=1;i<=n;i++)
	   {
		   if(n%i==0)
			   count++;
	   }
	return count;
   }
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n = s.nextInt();
int c = getCountDivisor(n);
System.out.println(c);
	}

}
