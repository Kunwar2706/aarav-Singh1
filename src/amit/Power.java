package amit;

import java.util.Scanner;

public class Power {
      static int getPower(int n,int p)
      {
    	 int  pow=1;
    	  while(p>0)
    	  {
    		  pow=pow*n;
    		  p--;
    	  }
		return pow;
      }
	public static void main(String[] args) {
		//int rs = getPower(2,3);
		Scanner s=new Scanner(System.in);
		System.out.println("enter the base ");
		int n=nextInt();
		System.out.println("enter the power");
		int p=nextInt();
		int rs=getPower(n,p);
		System.out.println(rs);
	}
	

}
