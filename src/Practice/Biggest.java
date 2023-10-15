package Practice;

import java.util.Scanner;

public class Biggest {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the 1 st value");
int x=s.nextInt();
System.out.println("enter the 2 st value");
int y=s.nextInt();
System.out.println("enter the 3 st value");
int z=s.nextInt();
if(x>y && x>z)
{
	System.out.println(x+" is biggest value");
}
else if(y>z)
{
	System.out.println(y+" is a biggest");
}
else
{
	System.out.println(z+" is the biggest");
}
	
	}

}
