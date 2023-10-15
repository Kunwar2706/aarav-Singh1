package Practice;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	System.out.println();
	for (int i=n;i>=0;i--) 
	{
		System.out.println(i);
	}

	}

}
