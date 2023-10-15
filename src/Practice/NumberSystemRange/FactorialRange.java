package Practice.NumberSystemRange;

import java.util.Scanner;

public class FactorialRange {

	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the range");
int n=s.nextInt();

for(int num=1;num<=n;num++) {
	long fact=1;
for(int i=1;i<=num;i++ )
{
	fact=fact*i;
}
System.out.println("factorial of "+ num+"= " +fact);
	
	}

}
	}
