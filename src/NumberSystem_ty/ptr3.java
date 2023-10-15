package NumberSystem_ty;

public class ptr3 {

	public static void main(String[] args) {
//	* * * * * *
//	* * * * * 
//	* * * 
//	* *
//	*
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
System.out.println("==========================2nd way");
int row=5;
int star=5;
for(int i=1;i<=row;i++)
{
	for(int j=1;j<=star;j++) {
		System.out.print("* ");
	}
	System.out.println();
	star--;
}
	}

}
