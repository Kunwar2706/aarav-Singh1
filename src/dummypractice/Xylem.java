package dummypractice;

import java.util.Scanner;

public class Xylem {
 static  boolean checkXylemPhy(int n)
 {
	 int os=0;int ms=0;
	 os=os+n%10;
	 n=n/10;
	 while(n>9)
	 {
		 ms=ms+n%10;
		 n=n/10;
      }
	 os=os+n;
	 if(os==ms)
	 {
		 return true;
	 }
	 else {
		 return false;
	 }
	 
 }
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
boolean rs = checkXylemPhy(n);
if(rs)
{
	System.out.println("is xylem no");
}
else {
	System.out.println("is phylom no");
}
	}

}
