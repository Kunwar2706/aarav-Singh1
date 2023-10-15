package Practice;

import java.util.Scanner;

public class Biggest2 {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the 1 st value");
int x=s.nextInt();
System.out.println("enter the 2 st value");
int y=s.nextInt();
System.out.println("enter the 3 st value");
int z=s.nextInt();
int big=(x>y)?x:y;
big=(z>big)?z:big;
System.out.println("biggest is " + big);
	}
}
