package Practice;

import java.util.Scanner;

public class SmallestNO {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the 1st value");
int x=s.nextInt();
System.out.println("enter the 2nd value");
int y=s.nextInt();
System.out.println("enter the 3rd value");
int z=s.nextInt();
if(x<y&& x<z)
{
	System.out.println(x+ " is the smallest no");
}
else if(y<z)
{
	System.out.println(y+ " is the smallest no");
}
System.out.println(z+" is the smallest no");
	}

}
