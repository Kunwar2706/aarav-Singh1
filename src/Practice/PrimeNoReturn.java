package Practice;

import java.util.Scanner;

public class PrimeNoReturn {
static  boolean isPrimeNo(int x)
{
	for(int i=2;i<=x/2;i++)
	{
		if(x%i==0)
		 return false;
			}
	
	return true;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
	boolean	 rs =isPrimeNo(n);
	if(rs==true)
		System.out.println(+n+""+"is  aprime no");
	else
		System.out.println(+n+""+"is not  a prime no");
				

	}

}

