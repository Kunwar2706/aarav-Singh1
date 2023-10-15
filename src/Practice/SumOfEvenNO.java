package Practice;

import java.util.Scanner;

public class SumOfEvenNO {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        System.out.println("enter the no");
        int n=s.nextInt(); 
        int sum=0;
    	for(int i=1;i<=n;i++) 
    	{
    		if(i%2==0)
    	
    			sum=sum+i;
    	
    	
	}
    	System.out.println(sum);

}}
