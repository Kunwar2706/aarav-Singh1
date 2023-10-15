package NumberSystem_ty;

public class Ptr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //* 
		//* * 
		//* * * 
		//* * * * 
		//* * * * *
		int n=5;
		for(int i=1;i<=n;i++)//row
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		System.out.println("============================");
		int row=5;
		int star=1;
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=star;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		star++;
		}
		
	}

}
