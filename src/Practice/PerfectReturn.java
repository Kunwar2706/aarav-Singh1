 package Practice;

import java.util.Scanner;

public class PerfectReturn {
         static   boolean isPerfect(int x)
         {
        	 int sum=0;
        	 for(int i=1;i<=x/2;i++)
        	 {
        		 if(x%i==0)
        			 sum=sum+i;
        	 }
        	 if(sum==x)
        		 return true;
        	 else
        		 return false;
         }
	public static void main(String[] args ) {
	Scanner s=new Scanner (System.in);
	System.out.println("enter the prime no");
	int n=s.nextInt();
	boolean rs=isPerfect(n);
			
			if(rs==true)
			{
				System.out.println(n+"is a perfact no");
			}
			else
				System.out.println(n+"is not a perfact no");
			
	}}
