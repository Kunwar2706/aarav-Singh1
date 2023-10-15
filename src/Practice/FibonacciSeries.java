package Practice;

import java.util.Scanner;

public class FibonacciSeries {
static  int fib(int n)
{
	if(n==0)
		return 0;
	if(n==1)
		return 1;
	return fib(n-1)+fib(n-2);
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int f = fib(n);
System.out.println(f);
	}

}
