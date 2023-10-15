package amit;

import java.util.Scanner;

public class ArmstronNo {
static int pow(int n,int p)
{ 
	int pow=1;
	while(p>0)
	{
		pow=pow*n;
	 p--;
   }
return pow;
} 
static int digitCount(int n)
{
	int count=0;
	while(n!=0)
	{
		count++;
		n=n/10;
	}
	return count;
}
 static boolean isArmStrongNo(int n)
 {
	 int dc = digitCount(n);
	 int sum=0;int temp=n;
	 do {
		 int d=n%10;
		 sum=sum+pow(d,dc);
		 n=n/10	; 
	 }
	 while(n!=0);
	 {
		 
	 }
	return sum==temp;
	 
 }
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("enter the no");
    int n=s.nextInt();
    boolean rs =isArmStrongNo(n);
    if(rs==true)
    {
   System.out.println("is arm strong no");
    }
    else
    {
    	System.out.println(" is not a arm strong no");
    }
	}

}
