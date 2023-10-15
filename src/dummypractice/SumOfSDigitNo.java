package dummypractice;

import java.util.Scanner;

public class SumOfSDigitNo {
  static int SumOFSDigit(int x)
  { 
	  int sum=0;
	  while(x!=0)
	{
		int d=x%10;
		sum=sum+d;
		x=x/10;
	}
	return sum;
  }
	public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     System.out.println("enter the no");
     int n=s.nextInt();
    int s1= SumOFSDigit(n);
    System.out.println(s1);
	}

}
