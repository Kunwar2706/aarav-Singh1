package amit;

import java.util.Scanner;

public class ProductOfDigit {
 static int productDigit(int n) {
	 int product=1;
	 while(n!=0)
	 {
		 int d=n%10;
		 product=product*1;
		 n=n/10;
	 }
	return product;
 }
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int pd = productDigit(n);
System.out.println(pd);
	}

}
