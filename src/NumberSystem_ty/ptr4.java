package NumberSystem_ty;

public class ptr4 {

	public static void main(String[] args) {
		//		     *
		//		   * *
		//		 * * *
		//	   * * * *
		//   * * * * * 
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)//for space
			{
				System.out.print("  ") ;
			}
			
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		
		System.out.println("================");
		int row=5;
		int space=4;
		int star=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star++;
		}
		
		}
	}



