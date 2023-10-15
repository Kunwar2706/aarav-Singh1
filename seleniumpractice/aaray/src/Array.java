import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc =new Scanner(System.in);
int a[] =new int[5];
System.out.println("enter the no");
for(int i=0;i<a.length;i++)
{
 a[i]=sc.nextInt();
int sum = getsum(a);
System.out.println("total sum:" +sum);
}}
public static int getsum(int x[])
{
int sum=0;

for(int i=0;i<x.length;i++) {
sum=sum+x[i];
}
return sum;
   
	}

}
