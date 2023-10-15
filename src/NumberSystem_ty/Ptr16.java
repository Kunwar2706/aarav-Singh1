 package NumberSystem_ty;

public class Ptr16 {

	public static void main(String[] args) {
	int n=5;
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
		System.out.println("====================");
		int row=5;
		int value=1;
		char ch1='A';
		for(int i=1; i<=row; i++)
		{
			for(int j=1;j<=value;j++) 
			{
				System.out.print(ch1++ +" ");
			
			}
			System.out.println();
			value++;
		}

	}

}
