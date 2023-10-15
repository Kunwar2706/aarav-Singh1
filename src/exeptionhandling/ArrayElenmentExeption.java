package exeptionhandling;

import java.util.Scanner;

public class ArrayElenmentExeption {
	public static void ArrayRead()
	{
		
	}
public static void Main()  
{
	
}
	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("enter the length of array");
	int n =s.nextInt();
	int a[]=new int[n];
	System.out.println("enter eliments");
	for(int i=0;i<=a.length;i++)
	{
	a[i]=s.nextInt();
	}
	System.out.println("done");
	}

}
