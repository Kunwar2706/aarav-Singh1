package Practice;

import java.util.Scanner;

public class SpecialNO {
  static  boolean getSpecialNo(int n)

  {
	  int d1=n%10;
	  int d2=n/10;
	int   sum=d1+d2+d1*d2;
  if(sum==n)
  {
	  return true;
  }
	  else 
	  {
		  return false;
				  
	  }
  }
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
boolean rs=getSpecialNo(n);
if(rs==true)
{
	System.out.println(n+" is a special two digit no");
}
else
{
	System.out.println(n+ " is not a special two digit no");
}

	}

}
