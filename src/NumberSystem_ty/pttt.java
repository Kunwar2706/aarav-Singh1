package NumberSystem_ty;

public class pttt {

	public static void main(String[] args) {
		int row=5;
		int value =1;
		int space=4;

		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=value;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			value++;
			space--;
		}

		int row1=4;
		int space1=1;
		int star=4;



		for(int i=1;i<=row1;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}

			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}


			space1++;
			star--;
			System.out.println();
		}



	}
}

