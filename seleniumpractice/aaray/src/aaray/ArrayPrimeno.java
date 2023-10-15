package aaray;

import java.util.Scanner;
public class ArrayPrimeno
{
	
int [] readArray()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of an array");
	int n=sc.nextInt();
	int ar[]= new int[n];
	System.out.println("enter   " +n+  " values");
	for(int i=0;i<ar.length;i++)
	{ 
		ar[i]=sc.nextInt();
	}
	return ar;
}
void Disp(int ar [])
{
	for(int i=0;i<ar.length;i++)
	System.out.println(ar[i] +" ");
	System.out.println();
}
 static  int  countPrimeno(int ar[])
 {
	
		int count =0;
		for(int i =0; i<ar.length;i++)
		{
		boolean rs= isPrimeno(ar[i]);
		if(rs==true)
		count++;
		}
		
 return count;
 }
		static boolean isPrimeno(int x)
		 {
		for  (int i=2;i<=x/2;i++) 
		{
		if(x%i==0)
		  
			return false;
		} 
		
			return true;
		
		}
		 

		 
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayPrimeno ob= new ArrayPrimeno();
		
		int x[]=ob.readArray();
		ob.Disp(x);
		System.out.println("no of prime no"+countPrimeno(x));
				
	}

}
