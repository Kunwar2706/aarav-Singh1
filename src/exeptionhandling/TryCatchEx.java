package exeptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the name");
		String n=s.next();
		try 
		{
	    print(n);
	    
		}
		catch (InputMismatchException ob)
		{
		}
		
		catch(StringIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("string last index is length-1");
		}
		System.out.println("completed");
	}
		public static void print(String n)
		{
			int l=n.length();
			char ch=n.charAt(l);
			System.out.println(ch);
		}
	}
	


