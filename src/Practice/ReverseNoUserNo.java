package Practice;

import java.util.Scanner;

public class ReverseNoUserNo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int rev=0;
while(n!=0)
{
	int d=n%10;
	rev=rev*10+d;
	n=n/10;
}
System.out.println();
System.out.println(rev);
	}

}
