package patternpractice;

public class p7 {

	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
