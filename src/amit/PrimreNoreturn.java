package amit;

import java.util.Scanner;

public class PrimreNoreturn {
	
static boolean isPrimeNo(int n)
{
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
		else 
		{
			return true;
	    }
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt(n);
boolean rs = isPrimeNo(n);
if(rs==true)
{
	System.out.println((+n+" "+"is a  prime no");
	else {
		System.out.println((+n+""+"is  a not prime no");
	}
}
	}

}
