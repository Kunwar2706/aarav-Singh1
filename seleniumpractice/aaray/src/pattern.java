import java.util.Scanner;
public class pattern
{
public static void main(String []qq)
{
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
for (int i=1;i<=n;i++)	
{
	for (int j=i; j<=n-i; j++)
	{
		System.out.print("  ");
    }
	for (int j=i;j<=n; j++)
	{
System.out.print(+j);
}
	System.out.println();
}
}}
