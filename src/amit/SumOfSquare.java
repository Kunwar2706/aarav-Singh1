package amit;

import java.util.Scanner;

public class SumOfSquare {
 static int getSquareSum(int n)
 {
	 int sum=0;
	 while(n!=0)
	 {
		 int d=n%10;
		 sum=sum+d*d;
		 n=n/10;
	 }
	return sum;
 }
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int sm = getSquareSum(n);
System.out.println(sm);
	}

}
