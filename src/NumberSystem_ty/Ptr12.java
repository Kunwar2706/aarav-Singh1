package NumberSystem_ty;

public class Ptr12 {

	public static void main(String[] args) {
		
//		1 
//		2 2 
//		3 3 3 
//		4 4 4 4 
//		5 5 5 5 5 

int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}  
		

		
		System.out.println("=======================================");
		int row=5;
		int value=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1 ;j<=value;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			value++;
		}

}
}
