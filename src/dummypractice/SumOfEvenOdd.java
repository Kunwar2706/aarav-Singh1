package dummypractice;

import java.util.Scanner;

public class SumOfEvenOdd {
		
	public static void main(String[] args){
		 Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	int es=0; int os=0;
	for(int i=1;i<=n;i++)
	{
		if(i%2==0)
			es=es+i;
		else
			os=os+i;
   
    }
	System.out.println(" sum of even no: " +es);
    System.out.println(" sum of odd No. :" +os);
}
	}

