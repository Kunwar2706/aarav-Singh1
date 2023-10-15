package Practice;

import java.util.Scanner;

public class CountTheWordsInString {

	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();//welcome to java
		int wc=1; 
		for(int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ') && ( s.charAt(i+1)!=' ')) 
			{
				wc++;
			}
		}
		System.out.println("no of words in a string is: " +wc);

	}

}
