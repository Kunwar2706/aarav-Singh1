package NumberSystem_ty;

public class Ptr18 {

	public static void main(String[] args) {
		int k=1;
		int row=5;
		int value=1;
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=value;j++)
			{
				if(k<=9)
				{
					System.out.print(k++ +" ");
				}
				else

				{
					k=1;
					System.out.print(k++);

				}
				
			}
			System.out.println();
			value++;
		}

	}
}
