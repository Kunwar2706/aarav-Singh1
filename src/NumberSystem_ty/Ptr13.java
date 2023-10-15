package NumberSystem_ty;

public class Ptr13 {

	public static void main(String[] args) {
//		 1 1 1 1 1 
//		  2 2 2 2 
//		   3 3 3 
//		    4 4 
//		     5 

		int n=5;

		for(int i=1;i<=n;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("=============================================");
		int row=5;
		int value=5;
		int space=0;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=value;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			
			value--;
			space++;
	}
}
}
