package Practice;

import java.util.Scanner;

public class Mulitiplication {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}

	}

}
