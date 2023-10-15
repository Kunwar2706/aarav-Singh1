package Practice;

import java.util.Scanner;

public class MiddleNoByUsingNo {
static int getMiddleNo(int x,int y,int z)
{
	if(x>y && x<z || x>z && x<y)
		return x;
	else if(y>x && y<z ||y>z && y<x )
		return y;
	else 
		return z;
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the 1st value");
int x=s.nextInt();
System.out.println("enter the 2nd  value");
int y=s.nextInt();
System.out.println("enter the 3rd value");
int z=s.nextInt();
int midl = getMiddleNo(x,y,z);
System.out.println(midl+ " is a middle no");

	}

}
