package Practice;

import java.util.Scanner;

public class MiddleNO {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the 1 st value");
			int x=s.nextInt();
			System.out.println("enter the 2 st value");
			int y=s.nextInt();
			System.out.println("enter the 3 st value");
			int z=s.nextInt();
			if(x>y && x<z||x>z && x<y)
			{
			System.out.println(x+" is middle no");
	         }
			else if(y>x && y<z||y>z && y<x)
			{
				System.out.println(y +" is middle no");
			}
			else
			{
				System.out.println(z +" is middle no");
			}

}
}