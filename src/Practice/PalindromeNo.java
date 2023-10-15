package Practice;

import java.util.Scanner;

public class PalindromeNo {
 static boolean isPAlindromeNo(int n)
 {
	 int rev =0;  int temp=n;
	 do 
	 {
		 int d=n%10;
		 rev=rev*10+d;
		 n=n/10;
	 } 
	 while(n!=0);
	return rev==temp;
 }
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no.");
int n=s.nextInt();//121

boolean rs = isPAlindromeNo(n);
if(rs==true)
	System.out.println("no is palindrome");
else 
	System.out.println("no is not a palindrome");

	}

}
