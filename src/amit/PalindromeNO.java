package amit;

import java.util.Scanner;

public class PalindromeNO {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no");
		int n=s.nextInt();
		int rev=0; int temp=n;
		while(n!=0)
		{
			int d =n%10;
			rev=rev*10+d;
			n=n/10;
		}
		if(rev==temp)
		{
			System.out.println(+temp+ " is a palindrome ");
		}
		else 
			
		System.out.println(+temp+ " is not a palindrome");
	}

}
