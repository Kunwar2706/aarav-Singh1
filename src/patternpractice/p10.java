package patternpractice;

public class p10 {

	public static void main(String[] args) {
		int n=5;
		int num=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(num%2+" ");
				num++;
			}
			System.out.println();
		}
	}

}
