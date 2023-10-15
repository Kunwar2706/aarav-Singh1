package dummypractice;

import java.util.Scanner;

public class Strong {
         static int getFact(int n)
         { 
        	 int fact=1;
        	 while(n!=0)
        	 {
        		 fact=fact*n;
        				 n--;
        	 }
			return fact;
        	 
         }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int sum=0;int temp=n;
		while(n!=0) 
		{   int d=n%10;
			sum=sum+getFact(d);
			n=n/10;
		}
     if(sum==temp)
     {
    	 System.out.println("is a strong");
     }
     else {
    	 System.out.println("is not  strong no");
     }
	}

}
