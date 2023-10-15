package dummypractice;

import java.util.Scanner;

public class ArmStrongNo {
public static int digitCount(int n) {
	int count =0;
	while(n!=0)
	{
		count++;
		n=n%10;
	}
	return count;
}
public static int pow(int n,int p) {
	int pow=1;
	while(p>1) {
		 pow = pow*n;
		p--;
		
	}
	return pow;
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the no");
int n=s.nextInt();
int sum=0;
int temp =n;

int dc=digitCount(n);
while(n!=0) {
	int d=n%10;
	sum=sum+pow(d,dc);
	n=n/10;
	
}
if(sum==temp)
{
	System.out.println("is a arm strong no");
}
else {
	System.out.println(" is not a prime no");
}

	}

}
