package Practice;

import java.util.Scanner;

public class XylemFylem {
	static String checkXP(int n)
	{
		int os=0,ms=0;
		os=os+n%10;
		n=n/10;
		while(n>9)
		{
			ms=ms+n%10;
			n=n/10;
		}
		os=os+n;
	
	if(os==ms) {
	
		return "xylem";
	}
		else
		{
			return "phylem";
		}
	
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the no");
	int n=s.nextInt();
	String rs = checkXP(n);
	if(rs.equals("xylem"))
	{
		System.out.println(n+" is a xylem no");
	}
	else
	{
		System.out.println(n+ " is a phylom no");
	}

}
}
