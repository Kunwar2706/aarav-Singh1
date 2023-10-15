package amit;

import java.util.Scanner;

public class ReverseNO {
static int getReverse(int n)
{
	int rev=0;
	while(n!=0)
	{
		int d=n%10;
		rev=rev*10+d;
		n=n/10;
	}
	return rev;
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int rv = getReverse(n);
System.out.println(rv);
	}

}
