package Practice;

import java.util.Scanner;

public class BigeestByUsingMethod {
	static int getBiggest(int x,int y,int z)
	{
		if(x>y && x>z)

			return x;

		else if(y>z )

			return y;

		else 

			return z;

	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the 1st value");
		int x=s.nextInt();
		System.out.println("enter the 2nd value");
		int y=s.nextInt();
		System.out.println("enter the 3rd value");
		int z=s.nextInt();
		int big = getBiggest(x,y,z);
		System.out.println(big +" 10is biggest no");


	}

}
