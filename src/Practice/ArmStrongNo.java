package Practice;

import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int sum=0,temp=n; 

while(n!=0)
	{
	int d=n%10;
	sum=sum+(d*d*d);
	n=n/10;
}
if(sum==temp) 
{
	System.out.println("is arm stron no");
	
}
else
{
	System.out.println("is not a arm strong no");
}
	}

}
