package NumberSystem_ty;

public class Ptr7 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ") ;
			}
			
				for(int j=i;j<=n;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
//		 ===2nd way=====
//		* * * * * 
//		 * * * * 
//		  * * * 
//		   * * 
//		    * 

		System.out.println("===2nd way=====");
		
		int row=5;
		int space=0;
		int star=5;
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
			space++;
			star--;
		}
	}

}