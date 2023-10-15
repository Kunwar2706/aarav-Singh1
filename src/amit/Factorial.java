package amit;

import java.util.Scanner;

public class Factorial {
 static int getFact(int n)
 {
  int fact=1;
 for(int i=n;i>0;i--)
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
int rs = getFact(n);
System.out.println(rs);
	}

}
