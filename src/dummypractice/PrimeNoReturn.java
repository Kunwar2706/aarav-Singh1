package dummypractice;

import java.util.Scanner;

public class PrimeNoReturn {
  static boolean  isPrimeNO(int x)
  {
	  int count=0;
	  for(int i=1;i<=x;i++)
	  {
		  if(x%i==0)
			  count++;
	  }
if(count==2)
  return true;
else 
	return false;
  }
  
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
boolean rs=isPrimeNO(n);
if(rs==true)
	System.out.println("is a prime no");
else 
	System.out.println("is not  a prime no");
	}

}
