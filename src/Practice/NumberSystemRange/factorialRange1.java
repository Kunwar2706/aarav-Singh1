package Practice.NumberSystemRange;

import java.util.Scanner;

public class factorialRange1 {
static int fact(int n) {
int fact=1;
while(n>0)
{
	fact=fact*n;
	n--;
}
return fact;
}
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter the range");
int n=s.nextInt();
for(int i=1;i<=n;i++)
{
	System.out.println(+i+"--->" +fact(i) );

	}

}
	}
