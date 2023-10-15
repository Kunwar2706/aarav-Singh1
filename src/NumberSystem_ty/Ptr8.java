package NumberSystem_ty;

public class Ptr8 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)//for space
			{
				System.out.print(" ") ;
			}
			
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		
			
		
		for(int i=1; i<=n-1; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ") ;
			}
			
				for(int j=i; j<=n-1; j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
System.out.println("=============================");
int row=5;
int space=4;
int star=1;
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=space;j++)
	{
		System.out.print(" ");
	}
	for(int k=1;k<=star;k++)
	{
		System.out.print("* ");
	}
	System.out.println();
	space--;
	star++;
}
	
	int row1=4;
	int space1=1;
	int star1=4;
	for(int i=1; i<=row1; i++)
	{
		for(int j=1; j<=space1; j++)
		{
			System.out.print(" ");
		}
		for(int k=1; k<=star1; k++)
		{
			System.out.print("* ");
		}
		System.out.println();
		space1++;
		star1--;
	}
	
	
}
	}


